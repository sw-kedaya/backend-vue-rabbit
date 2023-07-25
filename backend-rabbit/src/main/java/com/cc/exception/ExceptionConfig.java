package com.cc.exception;

import com.cc.dto.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionConfig {
    @ExceptionHandler(RuntimeException.class)
    public Result defaultHandler(RuntimeException ex){
        return Result.fail("服务器异常: " + ex.getMessage());
    }
}
