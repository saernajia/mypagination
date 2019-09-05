package com.redapplenet.cloud.util.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "buss_param_config")
@NameStyle(Style.normal)
public class BussParamConfig {
	@Id
    private String param_id;

    private String param_code;

    private String param_name;

    private String param_value;

    private String remark;

    private String channel;

    private String param_status;
}
