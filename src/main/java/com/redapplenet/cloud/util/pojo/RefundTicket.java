package com.redapplenet.cloud.util.pojo;

import lombok.Data;

/**
 * @program: OtaProjects
 * @description: 退票票号
 * @author: huangyikai
 * @create: 2019-09-03 17:42
 * @Version: 1.0
 */
@Data
public class RefundTicket {
    private String tktNo;
    private String segid;//航段序号:1去程、2返程
}
