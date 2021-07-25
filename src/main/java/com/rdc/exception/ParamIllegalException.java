package com.rdc.exception;

import com.rdc.utils.ResultCode;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParamIllegalException extends RuntimeException {
    private ResultCode rc;
    private String message;
    private Map<String ,String> otherMsg = new HashMap<>(4);
    public ParamIllegalException(BindingResult br){
        List<ObjectError> allErrors = br.getAllErrors();
        for (ObjectError error : allErrors) {
            otherMsg.put(error.getCode(),error.getDefaultMessage());
        }
        this.rc = ResultCode.PARAM_ILLEGAL;
        this.message = rc.getMsg();
    }
    public ResultCode getRc() {
        return rc;
    }

    public Map<String, String> getOtherMsg() {
        return otherMsg;
    }

    public static void thorw(BindingResult br) {
        if (br.hasErrors()){
            throw new ParamIllegalException(br);
        }
    }
}
