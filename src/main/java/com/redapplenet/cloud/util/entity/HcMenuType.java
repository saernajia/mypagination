package com.redapplenet.cloud.util.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "hc_menu_type")
@NameStyle(Style.normal)
public class HcMenuType {
	@Id
    private String menu_type_id;

    private Integer order_number;

    private String resource_url;

    private Integer menu_flag;

    private String menu_name;

    private String parent_id;

    private Integer menu_level;
}
