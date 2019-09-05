package com.redapplenet.cloud.util.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "iata_correspond")
@NameStyle(Style.normal)
public class IataCorrespond {
	@Id
    private String IATA_ID;

    private String AIR_COMPANY;

    private String BASE;

    private String IATA_CODE;

    private String ICAO_CODE;

    private String IATA_COUNT;

    private String CALL_NUM;
}
