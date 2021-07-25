package com.rdc.exception;

import com.rdc.utils.ResultCode;

public class BusinessException extends RuntimeException {
    private ResultCode rc;
    private String messgae;
    public BusinessException(ResultCode rc){
        this.rc = rc;
        this.messgae = rc.getMsg();
    }
    public ResultCode getRc() {
        return rc;
    }
    public void setRc(ResultCode rc) {
        this.rc = rc;
    }
}
