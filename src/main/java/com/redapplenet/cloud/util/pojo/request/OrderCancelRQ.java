package com.redapplenet.cloud.util.pojo.request;

import com.redapplenet.cloud.util.pojo.AccessCommon;
import lombok.Data;

/**
 * @program: OtaProjects
 * @description: 订单取消入口参数
 * @author: huangyikai
 * @create: 2019-09-03 15:34
 * @Version: 1.0
 */
@Data
public class OrderCancelRQ extends AccessCommon {
    private String orderCode;
    private String cancelReason;
}
