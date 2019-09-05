package com.redapplenet.cloud.util.pojo.request;

import com.redapplenet.cloud.util.pojo.AccessCommon;
import com.redapplenet.cloud.util.pojo.Passenger;
import com.redapplenet.cloud.util.pojo.Post;
import lombok.Data;

/**
 * @program: OtaProjects
 * @description: 订单创建入口参数
 * @author: huangyikai
 * @create: 2019-09-03 15:29
 * @Version: 1.0
 */
@Data
public class OrderCreateRQ extends AccessCommon {
    private String sucCode;//验价编码
    private String channelOrderCode;
    private int orderAmount;
    private String contactName;
    private String contactMolile;
    private String contactEmail;
    private Passenger[] passengers;//乘机人
    private Post post;//行程单邮寄
}
