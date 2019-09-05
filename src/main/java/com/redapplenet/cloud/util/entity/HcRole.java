package com.redapplenet.cloud.util.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "hc_oper_role")
@NameStyle(Style.normal)
public class HcRole {
	@Id
    private String role_id;

    private String role_name;

    private String create_time;

    private String create_opid;

    private String comments;

    private Integer role_type;

    private String source_id;
}
