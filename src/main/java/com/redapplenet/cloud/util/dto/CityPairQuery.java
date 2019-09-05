package com.redapplenet.cloud.util.dto;

import lombok.Data;

/**
 * @ClassName CityPairQuery
 * @Description TODO
 * @Author yanqiong
 * @Date 2019/6/27 12:47
 */
@Data
public class CityPairQuery {
    private String deptCode;
    
    private String arriCode;
    
    private String fltNum;
    
    private String effectivedate;
    
    private String expirationdate;
}
