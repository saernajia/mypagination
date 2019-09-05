package com.redapplenet.cloud.util.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "ota_pay_method_param")
@NameStyle(Style.normal)
public class OtaPayMethodParam {
	@Id
    private String param_id;

    private String method_id;

    private String param_code;

    private String param_value;

    private String param_status;

    private String create_time;
}
