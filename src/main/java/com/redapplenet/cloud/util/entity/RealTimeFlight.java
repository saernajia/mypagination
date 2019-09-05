package com.redapplenet.cloud.util.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "real_time_flight")
@NameStyle(Style.normal)
public class RealTimeFlight {
	@Id
    private String flight_id;

    private String source_id;

    private String customer_id;

    private String airline;

    private String flight_no;

    private String dep_airport;

    private String arr_airport;

    private String dep_date;

    private String arr_date;

    private String dep_time;

    private String arr_time;

    private String dep_terminal;

    private String arr_terminal;

    private String duration;

    private String week;

    private String stop_id;

    private String stop_num;

    private String plane_type;

    private String meal;

    private String et;

    private String code_share;

    private String share_airline;

    private String share_flight_no;

    private String mile;

    private String wifi;

    private String cabin_crew;

    private String currency;

    private String create_time;

    private String abroad;
}
