package com.atroot.admin.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Description: 自定义异常并在应用中抛出以达到应用的的目的
 *
 * @author atroot@126.com  @ZYD
 * @create 2021.5.11 20:21
 */
@ResponseStatus(value = HttpStatus.FORBIDDEN,reason = "用户数量超标")
public class UserTooManyException extends RuntimeException{
    public UserTooManyException() {
    }

    public UserTooManyException(String message) {
        super(message);
    }
}
