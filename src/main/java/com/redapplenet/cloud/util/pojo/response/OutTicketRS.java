package com.redapplenet.cloud.util.pojo.response;

import com.redapplenet.cloud.util.pojo.ResponseCommon;
import com.redapplenet.cloud.util.pojo.Ticket;
import lombok.Data;

/**
 * @program: OtaProjects
 * @description: 申请出票出口参数
 * @author: huangyikai
 * @create: 2019-09-03 15:33
 * @Version: 1.0
 */
@Data
public class OutTicketRS extends ResponseCommon {
    private Ticket[] tickets;
}
