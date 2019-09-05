package com.redapplenet.cloud.util.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "ota_channel_account")
@NameStyle(Style.normal)
public class OtaChannelAccount {
	@Id
    private String channel_id;

    private String channel_code;

    private String channel_name;

    private String channel_user;

    private String channel_api_pwd;

    private String channel_login_pwd;

    private String contact_name;

    private String contact_mobile;

    private String create_channel_id;

    private String channel_status;

    private String role_id;

    private String create_time;

    private String modify_time;
}
