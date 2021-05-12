package com.atroot.admin.servlet;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.annotation.WebServlet;

/**
 * Description: 自定义监听器
 *
 * @author atroot@126.com  @ZYD
 * @create 2021.5.12 10:13
 */
//@WebListener
@Slf4j
public class MyListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        log.warn("监听器初始化");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        log.warn("监听器销毁");
    }
}
