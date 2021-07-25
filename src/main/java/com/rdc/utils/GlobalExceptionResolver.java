package com.rdc.utils;
import com.rdc.exception.BusinessException;
import com.rdc.exception.ParamIllegalException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


@ControllerAdvice

public class GlobalExceptionResolver {

    @ExceptionHandler(BusinessException.class)
    @ResponseBody
    public R BusinessExceptionHandler(BusinessException e){
        e.printStackTrace();
        return R.of(e.getRc());
    }

    @ExceptionHandler(ParamIllegalException.class)
    @ResponseBody
    public R ParamIllegalExceptionHandler(ParamIllegalException e){
        e.printStackTrace();
        return R.of(e.getRc(),e.getOtherMsg());
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public R ExceptionHandler(Exception e){
        e.printStackTrace();
        return R.of(ResultCode.UNKNOWN_ERROR);
    }

}
