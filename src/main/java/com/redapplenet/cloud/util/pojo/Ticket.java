package com.redapplenet.cloud.util.pojo;

import lombok.Data;

/**
 * @program: OtaProjects
 * @description: 客票信息
 * @author: huangyikai
 * @create: 2019-09-03 17:35
 * @Version: 1.0
 */
@Data
public class Ticket {
    private String name;
    private String IdentityNumber;
    private String tktNo;
    private String pnr;
}
