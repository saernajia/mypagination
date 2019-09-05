package com.redapplenet.cloud.util.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "ota_channel_buss_config")
@NameStyle(Style.normal)
public class OtaChannelBussConfig {
	@Id
    private String buss_id;

    private String channel;

    private String pay_time_limit;

    private String chd_sale_flag;

    private String inf_sale_flag;

    private String officia_sale_flag;

    private String police_disable_sale_flag;

    private String ct;

    private String share_code;

    private String share_code_airline;

    private String access_rate_min;

    private String query_base_num;

    private String query_book_rate;

    private String city_pair_roleid;

    private String cabin_roleid;

    private String send_sms_flag;

    private String seng_email_flag;

    private String create_time;

    private String modify_time;
}
