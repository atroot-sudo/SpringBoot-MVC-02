package com.atroot.admin.resolver;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static org.springframework.core.Ordered.HIGHEST_PRECEDENCE;

/**
 * Description:自定义错误解析器，可以作为全局异常处理器
 *
 * @author atroot@126.com  @ZYD
 * @create 2021.5.11 20:41
 */
//@Component
//@Order(value = HIGHEST_PRECEDENCE)   //设置优先级为最高
public class CustomerHandlerExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        try {
            response.sendError(512,"自定义的错误解析器");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ModelAndView();
    }
}
