package com.redapplenet.cloud.util.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "hc_role_menu_type")
@NameStyle(Style.normal)
public class HcRoleMenuType {
	@Id
    private String role_id;

    private String menu_type_id;

    private String relation_id;
}
