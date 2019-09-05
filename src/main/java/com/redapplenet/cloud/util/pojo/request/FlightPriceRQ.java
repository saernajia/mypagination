package com.redapplenet.cloud.util.pojo.request;

import com.redapplenet.cloud.util.pojo.AccessCommon;
import com.redapplenet.cloud.util.pojo.FlightPriceSegment;
import lombok.Data;

/**
 * @program: OtaProjects
 * @description: 航班验价入口参数
 * @author: huangyikai
 * @create: 2019-09-03 15:27
 * @Version: 1.0
 */
@Data
public class FlightPriceRQ extends AccessCommon {
    private FlightPriceSegment[] flightPriceSegments;
}
