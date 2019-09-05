package com.redapplenet.cloud.util.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "ota_channel_ip")
@NameStyle(Style.normal)
public class OtaChannelIp {
	@Id
    private String ip_id;

    private String channel_code;

    private String ip;

    private String create_time;
}
