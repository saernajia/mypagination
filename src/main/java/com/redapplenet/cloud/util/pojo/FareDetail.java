package com.redapplenet.cloud.util.pojo;

import lombok.Data;

/**
 * @program: OtaProjects
 * @description: 运价详情
 * @author: huangyikai
 * @create: 2019-09-03 16:13
 * @Version: 1.0
 */
@Data
public class FareDetail {
    private String cabin;
    private String passengerType;//ADT/CHD/INF
    private int totalAmount;//总金额 = 优惠运价 + 总税费
    private int saleAmount;//优惠运价
    private int baseAmount;//基础运价
    private int yBaseAmount;//Y舱基础运价
    private float discount;//折扣
    private String fareLevel;//运价级别
    private int totalTaxAmount;//总税费
    private Tax[] taxes;
}
