package com.redapplenet.cloud.util.entity;

import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "iata_correspond")
@NameStyle(Style.normal)
@ApiModel(value = "iata_correspond", description = "")
public class ITATCorrespond implements Serializable{

	private static final long serialVersionUID = 5231134212346077681L;

	@Id
	private String IATA_ID;

	@ApiModelProperty("航空公司名称")
	private String AIR_COMPANY;

	@ApiModelProperty("基地")
	private String BASE;

	@ApiModelProperty("代码")
	private String IATA_CODE;

	@ApiModelProperty("用户地址")
	private String ICAO_CODE;

	@ApiModelProperty("结算号")
	private String IATA_COUNT;

	@ApiModelProperty("呼号")
	private String CALL_NUM;

}
