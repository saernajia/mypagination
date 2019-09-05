package com.redapplenet.cloud.util.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "real_time_cabin")
@NameStyle(Style.normal)
public class RealTimeCabin {
	@Id
    private String cabin_id;

    private String flight_id;

    private String cabin;

    private String base_price;

    private String ybase_price;

    private String basis_class;

    private String discount;

    private String av_num;

    private String fbc;

    private String passenger_type;

    private String airport_tax;

    private String fuel_tax;

    private String other_tax;

    private String other_tax_detail;

    private String office;
}
