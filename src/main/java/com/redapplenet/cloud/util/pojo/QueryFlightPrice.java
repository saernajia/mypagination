package com.redapplenet.cloud.util.pojo;

import lombok.Data;

@Data
public class QueryFlightPrice {
    private String airline;	//航空公司代码
    private String fltNo;//航班号
    private String depCity;//出发城市
    private String arrCity;//到达城市
    private String takeoffDate;//起飞日期
    private String cabin;//舱位
}
