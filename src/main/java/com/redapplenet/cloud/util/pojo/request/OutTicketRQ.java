package com.redapplenet.cloud.util.pojo.request;

import com.redapplenet.cloud.util.pojo.AccessCommon;
import lombok.Data;

/**
 * @program: OtaProjects
 * @description: 申请出票入口参数
 * @author: huangyikai
 * @create: 2019-09-03 15:32
 * @Version: 1.0
 */
@Data
public class OutTicketRQ extends AccessCommon {
    private String orderCode;
}
