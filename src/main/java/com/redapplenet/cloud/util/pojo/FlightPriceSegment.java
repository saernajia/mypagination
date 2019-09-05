package com.redapplenet.cloud.util.pojo;

import lombok.Data;

/**
 * @program: OtaProjects
 * @description: 验价航段信息
 * @author: huangyikai
 * @create: 2019-09-03 17:07
 * @Version: 1.0
 */
@Data
public class FlightPriceSegment {
    private String airline;	//航空公司代码
    private String fltNo;//航班号
    private String depCity;//出发城市
    private String arrCity;//到达城市
    private String takeoffDate;//起飞日期
    private String cabin;//舱位
    private String seatNum;
    private FareDetail[] fareDetails;//运价详情
}
