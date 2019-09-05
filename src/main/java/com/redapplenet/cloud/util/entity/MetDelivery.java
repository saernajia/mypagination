package com.redapplenet.cloud.util.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "met_delivery")
@NameStyle(Style.normal)
public class MetDelivery {
	@Id
    private String delivery_id;

    private String order_code;

    private String addressee;

    private String phone;

    private String post_code;

    private String address;

    private String deliver_status;

    private String apply_type;

    private String apply_date;

    private String mail_type;

    private String mail_date;

    private String mail_no;

    private String conform_date;

    private String dc_date;

    private String recovery_status;

    private String channel;
}
