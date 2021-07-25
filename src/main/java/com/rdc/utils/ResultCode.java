package com.rdc.utils;

/**
 * @Description: 返回结果状态码
 * @author: myrdc
 * @date: 0:00 2021/7/26
 */
public enum  ResultCode {

    /**
     * 成功状态码
     */
    SUCCESS(200,"成功"),
    /**
     * 账户未登录
     */
    UN_LOGIN(300,"账户未登录"),
    /**
     * 未知异常
     */
    UNKNOWN_ERROR(10001, "未知异常"),
    /**
     * 参数不合法
     */
    PARAM_ILLEGAL(10006, "参数不合法");

    private Integer code;
    private String msg;

    ResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
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
