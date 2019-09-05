package com.redapplenet.cloud.util.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "city_pair")
@NameStyle(Style.normal)
public class CityPair {
	@Id
	private String CITY_PAIR_ID;

	@ApiModelProperty("航空公司名称")
	private String AIR_CODE ;

	@ApiModelProperty("航班号")
	private String FLT_NUM  ;

	@ApiModelProperty("航线类别")
	private String FLT_TYPE ;

	@ApiModelProperty("起飞城市三字码")
	private String DEPT_CODE;

	@ApiModelProperty("起飞城市名称")
	private String DEPT_NAME;

	@ApiModelProperty("起飞机场")
	private String DEPT_AIR;

	@ApiModelProperty("起飞机场航站楼")
	private String DEPT_AIR_TERMINAL;

	@ApiModelProperty("起飞时间")
	private String DEPT_TIME;

	@ApiModelProperty("到达城市三字码")
	private String ARRI_CODE;

	@ApiModelProperty("到达城市名称")
	private String ARRI_NAME;

	@ApiModelProperty("到达机场")
	private String ARRI_AIR;

	@ApiModelProperty("到达机场航站楼")
	private String ARRI_AIR_TERMINAL;

	@ApiModelProperty("到达时间")
	private String ARRI_TIME;

	@ApiModelProperty("经停城市")
	private String STOP_OVER_CITY;

	@ApiModelProperty("经停机场三字码")
	private String STOP_OVER_AIR;

	@ApiModelProperty("经停机场名称")
	private String STOP_OVER_AIR_NAME;

	@ApiModelProperty("经停到达时间")
	private String STOP_OVER_ARRI_TIME;

	@ApiModelProperty("经停起飞时间")
	private String STOP_OVER_DEPT_TIME;

	@ApiModelProperty("经停时间")
	private String STOP_OVER_MIN;

	@ApiModelProperty("共享代码")
	private String SHARE_CODE;

	@ApiModelProperty("航班班期")
	private String FLT_SCHEDULE;

	@ApiModelProperty("开始日期")
	private String START_DATE;

	@ApiModelProperty("截止日期")
	private String END_DATE;

	@ApiModelProperty("销售生效日期")
	private String SALE_DATE;

	@ApiModelProperty("创建日期")
	private String CREATE_DATE;

	@ApiModelProperty("状态 0：禁用 1：启用")
	private String CITY_STATUS;
}
