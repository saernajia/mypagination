package com.redapplenet.cloud.util.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "mid_sms")
@NameStyle(Style.normal)
public class MidSms {
	@Id
    private String sms_id;

    private String mobile;

    private String ip;

    private String msg;

    private String sms_status;

    private String create_time;

    private String send_time;

    private String templet_code;

    private String templet_name;

    private String check_code;

    private String user_code;

    private String create_date;

    private String sms_type;
}
