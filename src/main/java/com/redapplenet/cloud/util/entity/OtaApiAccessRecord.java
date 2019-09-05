package com.redapplenet.cloud.util.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "ota_api_access_record")
@NameStyle(Style.normal)
public class OtaApiAccessRecord {
	@Id
    private String record_id;

    private String interface_id;

    private String channel;

    private String resp_second;

    private String record_status;

    private String create_time;
}
