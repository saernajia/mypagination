package com.redapplenet.cloud.util.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "ota_api_interface")
@NameStyle(Style.normal)
public class OtaApiInterface {
	@Id
    private String interface_id;

    private String api_url;

    private String api_name;

    private String api_version;

    private String api_content;

    private String interface_status;

    private String create_time;

}
