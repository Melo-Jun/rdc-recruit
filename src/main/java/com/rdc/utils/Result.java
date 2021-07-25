package com.rdc.utils;
import java.util.Map;

/**
 * @Description: 返回结果统一封装类
 * @author: myrdc
 * @date: 0:03 2021/7/26
 */
public class Result {
    private Integer code;
    private String msg;
    private Map<String ,String> otherMsg;
    private Object data;

    public Result() {
    }

    public Result(Integer code, String msg, Map<String ,String> map) {
        this.code = code;
        this.msg = msg;
        this.otherMsg = map;
    }

    public Result(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static Result newResult(ResultCode rs, Object data){
        return new Result(rs.getCode(),rs.getMsg(),data);
    }
    public static Result newResult(ResultCode rs){
        return new Result(rs.getCode(),rs.getMsg(),null);
    }
    public static Result newResult(ResultCode rs, Map<String ,String> otherMsg){
        return new Result(rs.getCode(),rs.getMsg(),otherMsg);
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public Map getOtherMsg() {
        return otherMsg;
    }

    public void setOtherMsg(Map otherMsg) {
        this.otherMsg = otherMsg;
    }
}
