package com.redapplenet.cloud.util.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "metorder")
@NameStyle(Style.normal)
public class Metorder {
	@Id
    private String orderid;

    private String channel;

    private String mem_id;

    private String userid;

    private String username;

    private String conts_name;

    private String conts_mobile;

    private String conts_email;

    private String ordercode;

    private String chanel_ordercode;

    private String order_status;

    private String order_type;

    private String paymoney;

    private String fmoney;

    private String refund_money;

    private String adurtprice;

    private String chdrtprice;

    private String payid;

    private String paystatus;

    private String isinter;

    private String airtype;

    private String pnr;

    private String chd_pnr;

    private String afrom_fdate;

    private String ato_fdate;

    private String segments;

    private String guestnum;

    private String passengers;

    private String endpaytime;

    private String push_flag;

    private String send_email_flag;

    private String send_sms_flag;

    private String itinerary_status;

    private String book_flow;

    private String out_ticket_count;

    private String error_msg_flag;

    private String cancel_reason;

    private String creatime;

    private String creadate;

    private String create_datetime;
}
