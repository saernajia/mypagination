package com.redapplenet.cloud.util.pojo;

import lombok.Data;

/**
 * @program: OtaProjects
 * @description: 客票规则
 * @author: huangyikai
 * @create: 2019-09-03 16:11
 * @Version: 1.0
 */
@Data
public class TicketRule {
    private String type;//类别
    private String ratio;//比例
    private String ruleAmount;//金额
}
