package com.redapplenet.cloud.util.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "met_log")
@NameStyle(Style.normal)
public class MetLog {
	@Id
    private String log_id;

    private String create_time;

    private String operid;

    private String log_content;

    private String log_data;

    private String opaccount;

    private String opname;

    private String sourceid;

    private String log_type;

    private String date_id;
}
