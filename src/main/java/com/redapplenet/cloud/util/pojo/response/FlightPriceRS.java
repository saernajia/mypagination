package com.redapplenet.cloud.util.pojo.response;

import com.redapplenet.cloud.util.pojo.FlightPriceSegment;
import com.redapplenet.cloud.util.pojo.ResponseCommon;
import lombok.Data;

/**
 * @program: OtaProjects
 * @description: 航班验价出口参数
 * @author: huangyikai
 * @create: 2019-09-03 15:28
 * @Version: 1.0
 */
@Data
public class FlightPriceRS extends ResponseCommon {
    private String sucCode;//验价编码
    private FlightPriceSegment[] flightPriceSegments;//验价航段 0去程，1返程
}
