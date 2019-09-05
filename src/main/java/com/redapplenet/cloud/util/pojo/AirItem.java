package com.redapplenet.cloud.util.pojo;

import lombok.Data;

/**
 * @program: OtaProjects
 * @description: 行程
 * @author: huangyikai
 * @create: 2019-09-03 15:41
 * @Version: 1.0
 */
@Data
public class AirItem {
    private String depCity;//出发城市
    private String arrCity;//到达城市
    private String takeoffDate;//起飞日期
    private String depCityName;//出发城市名称
    private String arrCityName;//到达城市名称
    private String depAirportName;//出发机场名称
    private String arrAirportName;//到达机场名称
    private AirSegment[] airSegments;//航段信息
}
