package com.redapplenet.cloud.util.utils.contant;

public enum ResultCode {
    PARAM_IS_INVALID("1001", "参数无效"),
    RESULE_DATA_NONE("2001", "数据不存在"),
    DATA_ALREADY_EXISTED("3001", "数据已经存在"),
    USER_NOT_LOGGED_IN("4001", "会员未登录"),
    PERMISSION_NO_ACCESS("5001", "会员未授权"),
    INTERFACE_OUTTER_INVOKE_ERROR("6001", "远程调用错误"),
    SYSTEM_INNER_ERROR("7001", "系统内部错误"),
    CHANNEL_IS_NULL("S10001", "渠道号为空"),
    FLIGHT_IS_NULL("F10000", "航班信息为空"),
    FLIGHT_DATE_IS_NULL("F10001", "航班日期为空"),
    FLIGHT_NO_IS_NULL("F10002", "航班号为空"),
    CABIN_IS_NULL("F10003", "舱位等级为空"),
    AFROM_IS_NULL("F10004", "出发地为空"),
    ATO_IS_NULL("F10005", "目的地为空");
    private String resultCode;
    private String message;

    private ResultCode(String resultCode, String message) {
        this.message = message;
        this.resultCode = resultCode;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
