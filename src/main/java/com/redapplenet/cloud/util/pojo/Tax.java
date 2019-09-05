package com.redapplenet.cloud.util.pojo;

import lombok.Data;

/**
 * @program: OtaProjects
 * @description: 税费明细
 * @author: huangyikai
 * @create: 2019-09-03 16:20
 * @Version: 1.0
 */
@Data
public class Tax {
    private String taxCode;
    private int taxAmount;
    private String taxContent;
}
