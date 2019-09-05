package com.redapplenet.cloud.util.pojo.request;

import com.redapplenet.cloud.util.pojo.AccessCommon;
import lombok.Data;

/**
 * @program: OtaProjects
 * @description: 航班查询入口参数
 * @author: huangyikai
 * @create: 2019-09-03 15:17
 * @Version: 1.0
 */
@Data
public class AirShoppingRQ extends AccessCommon {
    private String fareType;//I国际/D国内
    private String depCity;//出发地
    private String arrCity;//到达地
    private String takeOffDate;//出发日期
    private String returnDate;//返回日期
}
