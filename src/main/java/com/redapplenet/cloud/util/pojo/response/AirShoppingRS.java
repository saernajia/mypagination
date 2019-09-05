package com.redapplenet.cloud.util.pojo.response;

import com.redapplenet.cloud.util.pojo.AirItem;
import com.redapplenet.cloud.util.pojo.ResponseCommon;
import lombok.Data;

/**
 * @program: OtaProjects
 * @description: 航班查询出口参数
 * @author: huangyikai
 * @create: 2019-09-03 15:18
 * @Version: 1.0
 */
@Data
public class AirShoppingRS extends ResponseCommon {
    private AirItem[] airItems;//0去程，1回程
}
