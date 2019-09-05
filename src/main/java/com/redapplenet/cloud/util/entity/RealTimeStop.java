package com.redapplenet.cloud.util.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "real_time_stop")
@NameStyle(Style.normal)
public class RealTimeStop {
	@Id
    private String stop_id;

    private String flight_date;

    private String flight_no;

    private String dep_airport;

    private String arr_airport;

    private String stop_dep_time;

    private String stop_arr_time;

    private String stop_time;

    private String create_time;
}
