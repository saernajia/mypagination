package com.redapplenet.cloud.util.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "ota_api_role")
@NameStyle(Style.normal)
public class OtaApiRole {
	@Id
    private String role_id;

    private String role_name;

    private String role_status;

    private String channel_id;

    private String interface_id;

    private String create_time;
}
