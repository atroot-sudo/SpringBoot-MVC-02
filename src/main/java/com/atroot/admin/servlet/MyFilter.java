package com.atroot.admin.servlet;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import java.io.IOException;

/**
 * Description:自定义过滤器
 *
 * @author atroot@126.com  @ZYD
 * @create 2021.5.12 10:12
 */
//@WebFilter(urlPatterns = "/myServlet")
@Slf4j
public class MyFilter extends HttpFilter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.warn("过滤器初始化");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.warn("过滤器工作");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        log.warn("过滤器销毁");
    }
}
