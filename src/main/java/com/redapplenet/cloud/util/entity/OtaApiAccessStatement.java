package com.redapplenet.cloud.util.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "ota_api_access_statement")
@NameStyle(Style.normal)
public class OtaApiAccessStatement {
	@Id
    private String statement_id;

    private String interface_id;

    private String channel;

    private String statement_date;

    private String statement_hour;

    private String statement_num;

    private String resp_second;

    private String succ_num;

    private String fail_num;

    private String create_time;
}
