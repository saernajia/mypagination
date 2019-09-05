package com.redapplenet.cloud.util.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "ota_pay_method")
@NameStyle(Style.normal)
public class OtaPayMethod {
	@Id
    private String method_id;

    private String method_name;

    private String business_code;

    private String pay_type;

    private String pay_status;

    private String remark;

    private String create_time;
}
