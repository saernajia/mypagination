package com.redapplenet.cloud.util.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "mid_dict")
@NameStyle(Style.normal)
public class MidDict {
	@Id
    private String dinc_id;

    private String dinc_code;

    private String dinc_name;

    private String dinc_sort;

    private String dinc_type;

    private String dinc_status;
}
