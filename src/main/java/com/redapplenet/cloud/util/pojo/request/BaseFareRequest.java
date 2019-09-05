package com.redapplenet.cloud.util.pojo.request;

import lombok.Data;

@Data
public class BaseFareRequest {
    private String depCity;//出发地
    private String arrCity;//到达地
    private String takeOffDate;//出发日期
    private String returnDate;//返回日期
    private int adtNum;
    private int chdNum;
    private int infNum;
}
