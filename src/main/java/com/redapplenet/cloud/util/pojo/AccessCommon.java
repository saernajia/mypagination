package com.redapplenet.cloud.util.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: OtaProjects
 * @description: 公共请求参数
 * @author: huangyikai
 * @create: 2019-09-03 15:21
 * @Version: 1.0
 */
@Data
public class AccessCommon implements Serializable {
    private String channelUser;//渠道用户名
    private String channelPwd;//渠道密码
    private String apiToken;//加密token
    private String version;//版本号
    private String airline;//航司二字码
    private String appUser;//应用用户
}
