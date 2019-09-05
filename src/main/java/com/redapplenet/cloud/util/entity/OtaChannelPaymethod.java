package com.redapplenet.cloud.util.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "ota_channel_paymethod")
@NameStyle(Style.normal)
public class OtaChannelPaymethod {
	@Id
    private String config_id;

    private String channel_id;

    private String method_id;

    private String settle_type;

    private String config_status;

    private String create_time;
}
