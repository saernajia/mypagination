package com.redapplenet.cloud.util.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "metaccountpay")
@NameStyle(Style.normal)
public class Metaccountpay {
	@Id
    private String payid;

    private String orderid;

    private String pay_method;

    private String paymoney;

    private String paytype;

    private String paystatus;

    private String paybillno;

    private String payserial;

    private String prepay_id;

    private String remark;

    private String accno;

    private String bankno;

    private String pay_time;

    private String motice_time;
}
