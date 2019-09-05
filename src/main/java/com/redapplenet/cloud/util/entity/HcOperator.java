package com.redapplenet.cloud.util.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "hc_operator")
@NameStyle(Style.normal)
public class HcOperator {
	@Id
    private String op_id;

    private String email;

    private String last_login_ip;

    private String last_login_time;

    private Integer login_count;

    private String mobile;

    private Integer is_online;

    private String op_account;

    private String op_name;

    private String op_pwd;

    private String phone;

    private String remark;

    private Integer oper_flag;

    private String source_id;

    private Integer oper_type;
}
