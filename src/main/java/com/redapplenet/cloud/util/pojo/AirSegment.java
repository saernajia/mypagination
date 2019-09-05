package com.redapplenet.cloud.util.pojo;

import lombok.Data;

/**
 * @program: OtaProjects
 * @description: 航段信息
 * @author: huangyikai
 * @create: 2019-09-03 15:49
 * @Version: 1.0
 */
@Data
public class AirSegment {
    private String airline;	//航空公司代码
    private String fltNo;//航班号
    private String depCity;//出发城市
    private String arrCity;//到达城市
    private String takeoffDate;//起飞日期
    private String takeoffDateTime;//起飞时间
    private String arrivalDateTime;//到达时间
    private String planeStyle;//飞机机型
    private String meal;//是否有餐
    private String mile;//里程
    private String eTicket;//是否电子票航班
    private String codeShare;//是否共享航班
    private String operateCarrier;//实际承运航班
    private String isAsr;//是否可以做机上座位预订
    private String stop;//经停点个数
    private String flightTimeMin;//飞行时长，分钟
    private String depTerminal;
    private String arrTerminal;
    private String addDay;
    private String tktIndex;
    private StopInfo stopInfo;//经停信息
    private ProductCabin[] productCabins;//舱位产品
}
