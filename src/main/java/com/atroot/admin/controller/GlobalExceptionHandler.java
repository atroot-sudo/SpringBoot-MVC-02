package com.atroot.admin.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Description: 处理整个Web controller的异常
 *
 * @author atroot@126.com  @ZYD
 * @create 2021.5.11 18:51
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler({ArithmeticException.class, NullPointerException.class})  //定义处理的异常类型
    public String handleArithmeticException(Exception e) {
        log.error("异常：{}", e.toString());
        return "login";  //视图地址
    }
}