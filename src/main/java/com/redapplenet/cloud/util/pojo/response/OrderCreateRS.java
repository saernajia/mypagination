package com.redapplenet.cloud.util.pojo.response;

import com.redapplenet.cloud.util.pojo.ResponseCommon;
import lombok.Data;

import java.util.List;

/**
 * @program: OtaProjects
 * @description: 订单创建出口参数
 * @author: huangyikai
 * @create: 2019-09-03 15:29
 * @Version: 1.0
 */
@Data
public class OrderCreateRS extends ResponseCommon {
    private String orderCode;
    private List<String> pnrs;
}
