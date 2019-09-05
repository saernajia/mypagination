package com.redapplenet.cloud.util.pojo;

import lombok.Data;

/**
 * @program: OtaProjects
 * @description: 行程单邮寄
 * @author: huangyikai
 * @create: 2019-09-03 17:26
 * @Version: 1.0
 */
@Data
public class Post {
    private String name;
    private String mobile;
    private String address;
    private String zipCode;
    private String postType;
    private String payType;
}
