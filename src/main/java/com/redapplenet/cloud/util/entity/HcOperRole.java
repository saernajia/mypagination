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
public class HcOperRole {
	@Id
    private String relation_id;

    private String op_id;

    private String role_id;
}
