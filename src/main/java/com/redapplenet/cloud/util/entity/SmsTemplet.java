package com.redapplenet.cloud.util.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "sms_templet")
@NameStyle(Style.normal)
public class SmsTemplet {
	@Id
    private String sms_id;

    private String templet_code;

    private String templet_name;

    private String max_times;

    private String check_type;

    private String valid_time;

    private String m_content;

    private String e_content;

    private String templet_status;

    private String send_mode;
}
