package com.rdc.exception;

import com.rdc.utils.ResultCode;

/**
 * @Description: 自定义业务异常类
 * @author: myrdc
 * @date: 0:01 2021/7/26
 */
public class BusinessException extends RuntimeException {
    private ResultCode resultCode;
    private String messgae;
    public BusinessException(ResultCode resultCode){
        this.resultCode = resultCode;
        this.messgae = resultCode.getMsg();
    }
    public ResultCode getResultCode() {
        return resultCode;
    }
    public void setResultCode(ResultCode resultCode) {
        this.resultCode = resultCode;
    }
}
