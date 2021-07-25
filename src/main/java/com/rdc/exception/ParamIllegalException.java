package com.rdc.exception;

import com.rdc.utils.ResultCode;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description: 参数校验异常
 * @author: myrdc
 * @date: 0:02 2021/7/26
 */
public class ParamIllegalException extends RuntimeException {
    private ResultCode resultCode;
    private String message;
    private Map<String ,String> otherMsg = new HashMap<>(4);
    public ParamIllegalException(BindingResult bindingResult){
        List<ObjectError> allErrors = bindingResult.getAllErrors();
        for (ObjectError error : allErrors) {
            otherMsg.put(error.getCode(),error.getDefaultMessage());
        }
        this.resultCode = ResultCode.PARAM_ILLEGAL;
        this.message = resultCode.getMsg();
    }
    public ResultCode getResultCode() {
        return resultCode;
    }

    public Map<String, String> getOtherMsg() {
        return otherMsg;
    }

    public static void throwException(BindingResult bindingResult) {
        if (bindingResult.hasErrors()){
            throw new ParamIllegalException(bindingResult);
        }
    }
}
