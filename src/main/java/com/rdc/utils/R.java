package com.rdc.utils;
import java.util.Map;

public class R {
    private Integer code;
    private String msg;
    private Map<String ,String> otherMsg;
    private Object data;

    public R() {
    }

    public R(Integer code, String msg, Map<String ,String> map) {
        this.code = code;
        this.msg = msg;
        this.otherMsg = map;
    }

    public R(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static R of(ResultCode rs, Object data){
        return new R(rs.getCode(),rs.getMsg(),data);
    }
    public static R of(ResultCode rs){
        return new R(rs.getCode(),rs.getMsg(),null);
    }
    public static R of(ResultCode rs, Map<String ,String> otherMsg){
        return new R(rs.getCode(),rs.getMsg(),otherMsg);
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
