package com.redapplenet.cloud.util.pojo;

import lombok.Data;

/**
 * @program: OtaProjects
 * @description: 舱位产品
 * @author: huangyikai
 * @create: 2019-09-03 16:05
 * @Version: 1.0
 */
@Data
public class ProductCabin {
    private String basisCabin;//基础舱位
    private String cabin;//舱位
    private String seatNum;//座位数量
    private String cabinName;//舱位名称
    private String baggage;//行李额
    private TicketRule[] refundTicketRules;//退票规则
    private TicketRule[] changeTicketRules;//改期规则
    private FareDetail[] fareDetails;//运价详情
}
