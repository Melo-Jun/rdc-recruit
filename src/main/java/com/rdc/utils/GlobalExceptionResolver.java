package com.rdc.utils;
import com.rdc.exception.BusinessException;
import com.rdc.exception.ParamIllegalException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @Description: 全局异常统一处理
 * @author: myrdc
 * @date: 0:01 2021/7/26
 */
@ControllerAdvice
public class GlobalExceptionResolver {

    @ExceptionHandler(BusinessException.class)
    @ResponseBody
    public Result BusinessExceptionHandler(BusinessException e){
        e.printStackTrace();
        return Result.newResult(e.getResultCode());
    }

    @ExceptionHandler(ParamIllegalException.class)
    @ResponseBody
    public Result ParamIllegalExceptionHandler(ParamIllegalException e){
        e.printStackTrace();
        return Result.newResult(e.getResultCode(),e.getOtherMsg());
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result ExceptionHandler(Exception e){
        e.printStackTrace();
        return Result.newResult(ResultCode.UNKNOWN_ERROR);
    }

}
