package com.redapplenet.cloud.util.pojo.request;

import com.redapplenet.cloud.util.pojo.AccessCommon;
import com.redapplenet.cloud.util.pojo.RefundTicket;
import lombok.Data;

/**
 * @program: OtaProjects
 * @description: 申请退票入口参数
 * @author: huangyikai
 * @create: 2019-09-03 15:35
 * @Version: 1.0
 */
@Data
public class RefundTicketRQ extends AccessCommon {
    private String orderCode;
    private String refundType;//0：自愿	1：非自愿
    private String involuntaryAttachment;//非自愿退票附件，BASE64编码字符串,附件大小不要超过2M
    private String attachmentName;//非自愿退票附件名字
    private String involuntaryReason;//非自愿退票原因 1：航班取消  2：航班延误  3：其他
    private String involuntaryRemark;//非自愿退票备注
    private String refundContactName;//退票联系人姓名
    private String refundContactMobile;//退票联系人手机
    private RefundTicket[] refundTickets;
}
