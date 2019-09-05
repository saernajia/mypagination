package com.redapplenet.cloud.util.pojo;

import lombok.Data;

/**
 * @program: OtaProjects
 * @description: 乘机人信息
 * @author: huangyikai
 * @create: 2019-09-03 17:21
 * @Version: 1.0
 */
@Data
public class Passenger {
    private String passengerType;//ADT/CHD/INF
    private String identityType;//证件类型
    private String identityNumber;//证件号
    private String name;
    private String birthdate;
    private String gender;

    private String spectype;//军警残类型
    private String specno;//军警残证件号
    private String jccardno;//军官(退役)证件号
}
