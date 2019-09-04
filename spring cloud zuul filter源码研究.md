# spring cloud zuul filter源码研究
spring cloud zuul在spring cloud体系中是作为一个服务网关的角色，常规的Eureka Server与service的组合虽然在服务消费与负载均衡方面已经比较完善，但是在对外提供rest api上以及对service进行统一的权限管理上存在着不足，因此，在构建spring cloud体系时，加入zuul作为对外统一的网关服务是十分必要的。

### spring cloud zuul搭建
zuul的搭建讲解可见[http://blog.didispace.com/springcloud5/](http://blog.didispace.com/springcloud5/)，再次就略过，本文主要讲解zuul中核心的fliter部分代码构成。

### spring cloud zuul源码
zuul的适用场景主要为rest api请求的权限验证，统一的异常处理。

filter位于spring-cloud-netflix-core模块的org.springframework.cloud.netflix.zuul.filters包下
![image](http://blog.didispace.com/assets/zuul-default-filter.png)

zuul将filter按照request请求的阶段划分出了不同阶段的过滤器

![image](http://blog.didispace.com/assets/zuul-filter-core.png)

具体的个阶段过滤器定义如上图，当一个rest api被调用时，首先进入pre阶段，依照顺序由小到大依次执行，经过pre阶段后，进入service，即常规的业务代码，返回结果后进入route阶段，最后进入post阶段。

    @Override
        public void service(javax.servlet.ServletRequest servletRequest, javax.servlet.ServletResponse servletResponse) throws ServletException, IOException {
            try {
                init((HttpServletRequest) servletRequest, (HttpServletResponse) servletResponse);
    
                // Marks this request as having passed through the "Zuul engine", as opposed to servlets
                // explicitly bound in web.xml, for which requests will not have the same data attached
                RequestContext context = RequestContext.getCurrentContext();
                context.setZuulEngineRan();
    
                try {
                    preRoute();
                } catch (ZuulException e) {
                    error(e);
                    postRoute();
                    return;
                }
                try {
                    route();
                } catch (ZuulException e) {
                    error(e);
                    postRoute();
                    return;
                }
                try {
                    postRoute();
                } catch (ZuulException e) {
                    error(e);
                    return;
                }
    
            } catch (Throwable e) {
                error(new ZuulException(e, 500, "UNHANDLED_EXCEPTION_" + e.getClass().getName()));
            } finally {
                RequestContext.getCurrentContext().unset();
            }
        }
        
上述代码位于com.netflix.zuul.http.ZuulServlet的service方法，实现了zuul处理请求时各阶段过滤器的执行逻辑，在三个try catch中可以看到还有一个error方法，用于处理异常，这个方法就是zuul filter内部对于过滤器各阶段出现异常的统一处理，在实际应用中可以手动实现这个error类，进而来实现自己业务场景中对于权限校验等的业务逻辑。

### fliter实际实现
以pre阶段的filter为例

    public class AccessFilter extends ZuulFilter  {
    
        private static Logger log = LoggerFactory.getLogger(AccessFilter.class);
    
        @Override
        public String filterType() {
            return "pre";
        }
    
        @Override
        public int filterOrder() {
            return 0;
        }
    
        @Override
        public boolean shouldFilter() {
            return true;
        }
    
        @Override
        public Object run() {
            RequestContext ctx = RequestContext.getCurrentContext();
            HttpServletRequest request = ctx.getRequest();
    
            log.info(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));
    
            Object accessToken = request.getParameter("accessToken");
            if(accessToken == null) {
                log.warn("access token is empty");
                ctx.setSendZuulResponse(false);
                ctx.setResponseStatusCode(401);
                return null;
            }
            log.info("access token ok");
            return null;
        }
    
    }
    

自定义过滤器的实现，需要继承ZuulFilter，需要重写实现下面四个方法：
1. filterType：返回一个字符串代表过滤器的类型，在zuul中定义了四种不同生命周期的过滤器类型，具体如下：
    1. pre：可以在请求被路由之前调用
    2. routing：在路由请求时候被调用
    3. post：在routing和error过滤器之后被调用
    4. error：处理请求时发生错误时被调用
2. filterOrder：通过int值来定义过滤器的执行顺序
3. shouldFilter：返回一个boolean类型来判断该过滤器是否要执行，所以通过此函数可实现过滤器的开关。在上例中，我们直接返回true，所以该过滤器总是生效。
4. run：过滤器的具体逻辑。需要注意，这里我们通过ctx.setSendZuulResponse(false)令zuul过滤该请求，不对其进行路由，然后通过ctx.setResponseStatusCode(401)设置了其返回的错误码，当然我们也可以进一步优化我们的返回，比如，通过ctx.setResponseBody(body)对返回body内容进行编辑等。

zuul在对外部请求处理时，根据ZuulFilter来决定过滤器加载顺序，首先在context中寻找继承实现了ZuulFilter的类，然后判断filterType是否是pre，routing，post，error这四种之一，如果是则根据顺序依次执行，否则跳过。