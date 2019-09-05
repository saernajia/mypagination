package com.redapplenet.cloud.util.pojo;

import lombok.Data;

/**
 * @program: OtaProjects
 * @description: 经停信息
 * @author: huangyikai
 * @create: 2019-09-03 16:02
 * @Version: 1.0
 */
@Data
public class StopInfo {
    private String stopCity;
    private String stopName;
    private String stopDepTime;
    private String stopArrTime;
    private String stopTimeMin;//经停时长，分钟
}
