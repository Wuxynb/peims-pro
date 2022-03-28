package com.example.peims.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 全局异常统一处理类
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 全局异常处理，返回JSON数据
     *
     * @param ex 异常
     * @return {@link Map} 异常信息
     */
    @ExceptionHandler(value = {Exception.class})
    @ResponseBody
    public Map<Object, Object> exceptionsHandler(Exception ex) {
        Map<Object, Object> map = new HashMap<>();
        map.put("code", 700);
        map.put("msg", ex.getMessage());
        map.put("ex", ex);

        return map;
    }
}
