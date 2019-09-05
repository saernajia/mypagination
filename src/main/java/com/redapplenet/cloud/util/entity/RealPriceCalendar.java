package com.redapplenet.cloud.util.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "real_price_calendar")
@NameStyle(Style.normal)
public class RealPriceCalendar {
	@Id
    private String price_id;

    private String airline;

    private String dep_airport;

    private String arr_airport;

    private String flight_date;

    private String price;

    private String create_time;

    private String modify_time;
}
