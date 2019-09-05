package com.redapplenet.cloud.util.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "metachange")
@NameStyle(Style.normal)
public class Metachange {
	@Id
    private String chg_Id;

    private String ticketid;

    private String happendate;

    private String happendtime;

    private String ctype;

    private String chg_status;

    private String nature;

    private String change_select;

    private String reason;

    private String actual_refund_money;

    private String refund_charge;

    private String refund_no;

    private String channel;

    private String is_transfer;

    private String is_print;

    private String creqdatetime;

    private String cresdatetime;

    private String refund_mark;

    private String chg_excpt;

    private String out_refund_no;

    private String out_refund_error;

    private String refund_file;

    private String op_id;

    private String op_date;

    private String afrom;

    private String ato;

    private String airways;

    private String fnumber;

    private String fdate;

    private String ftime;

    private String ttime;

    private String fare;

    private String seat;

    private String standard_price;

    private String fueltax;

    private String airporttax;

    private String money;

    private String tkt_no;
}
