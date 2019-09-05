package com.redapplenet.cloud.util.utils.web.filter;

/**
 * @Description 处理访问记录
 * @Author liuqn
 * @Date 2019/2/27 17:04
 * @Version
 **/
public class TraceUtil {
    private final static ThreadLocal local = new ThreadLocal();

    public static void saveTraceId(String traceId) {

        local.set(traceId);


    }

    public static String getTraceId() {


        return (String) local.get();
    }
}
