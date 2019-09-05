package com.redapplenet.cloud.util.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "met_refund")
@NameStyle(Style.normal)
public class MetRefund {
	@Id
    private String refund_id;

    private String ticketid;

    private String payid;

    private String refund_status;

    private String apply_date;

    private String apply_op;

    private String audit_date;

    private String audit_op;

    private String create_date;

    private String channel;

    private String apply_no;

    private String refund_date;

    private String order_code;

    private String pnr;

    private String bank_code;

    private String pay_type;

    private String pay_amouts;

    private String refund_amouts;

    private String passenger;

    private String phone;

    private String apply_remark;

    private String audit_remark;

    private String refund_amouts_actual;

    private String refund_amouts_date;

    private String eticketno;

    private String refund_type;

    private String refund_amouts_op;

    private String refund_amouts_remark;

    private String orderid;

    private String wx_refund_error_msg;
}
