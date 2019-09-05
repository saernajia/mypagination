package com.redapplenet.cloud.util.pojo.request;

import com.redapplenet.cloud.util.pojo.AccessCommon;
import lombok.Data;

/**
 * @program: OtaProjects
 * @description: 订单支付入口参数
 * @author: huangyikai
 * @create: 2019-09-03 15:30
 * @Version: 1.0
 */
@Data
public class OrderPayRQ extends AccessCommon {
    private String orderCode;
    private String payMethod;
    private String payAmount;
    private String bankOrderNo;//银行订单号
    private String bankTansNo;//交易流水号
//    private BankCard bankCard;//易宝|汇付使用

}
