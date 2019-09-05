package com.redapplenet.cloud.util.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "real_time_fare_rule")
@NameStyle(Style.normal)
public class RealTimeFareRule {
	@Id
    private String rule_id;

    private String rule_code;

    private String point_rate;

    private String dep_airport;

    private String arr_airport;

    private String flight_no;

    private String cabin;

    private String rule_type;

    private String rule_status;

    private String flight_date_start;

    private String flight_date_end;

    private String sale_date_start;

    private String sale_date_end;

    private String class_tag;

    private String tax_sale_type;

    private String promotion;

    private String amount;

    private String create_time;
}
