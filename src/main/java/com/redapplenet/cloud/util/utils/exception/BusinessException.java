package com.redapplenet.cloud.util.utils.exception;

import com.redapplenet.cloud.util.utils.web.filter.TraceUtil;


import java.time.LocalDateTime;

/**
 * @Description 业务异常父类
 * @Author liuqn
 * @Date 2019/2/27 13:55
 * @Version 1.0
 **/
public class BusinessException extends RuntimeException {
    /**
     * 错误代号
     **/
    private String code;
    /**
     * 异常信息描述
     **/
    private String message;
    /**
     * 异常信息
     **/
    private ExceptionInfo exceptionInfo;

    public BusinessException(String info, Object... args) {
        this();
        for (Object o : args) {

            info = info.replaceFirst("\\{\\}", String.valueOf(o));
            this.message = info;

        }
    }

    private void createExceptionInfo() {
        exceptionInfo = new ExceptionInfo();
        String exceptionId = LocalDateTime.now().toString().replace("T", "").replace(":", "").replace("-", "").replace(".", "");
        exceptionInfo.setExceptionId(exceptionId);
        StackTraceElement traceElement = this.getStackTrace()[0];
        exceptionInfo.setFileName(traceElement.getFileName());
        exceptionInfo.setLineNumber(traceElement.getLineNumber());
        exceptionInfo.setMethodName(traceElement.getMethodName());
        exceptionInfo.setClassName(traceElement.getClassName());
        exceptionInfo.setExceptionType(this.getClass().getName());
    }

    public BusinessException() {
        super();
        createExceptionInfo();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getMessage() {

        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ExceptionInfo getExceptionInfo() {
        return exceptionInfo;
    }

    public void setExceptionInfo(ExceptionInfo exceptionInfo) {
        this.exceptionInfo = exceptionInfo;
    }

    @Override
    public String toString() {
        return code + "<" + message + ">\nTraceId=" + TraceUtil.getTraceId() + "\n" + exceptionInfo;
    }
}
