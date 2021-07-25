package com.rdc.utils;

public enum  ResultCode {
    SUCCESS(200,"成功"),
    UN_LOGIN(300,"账户未登录"),
    UNKNOWN_ERROR(10001, "未知异常"),
    PARAM_ILLEGAL(10006, "参数不合法");

    private Integer code;
    private String msg;

    ResultCode(int code, String str) {
        this.code = code;
        this.msg = str;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }



}
