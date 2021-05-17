//package com.atroot.admin.interceptor;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.core.StringRedisTemplate;
//import org.springframework.stereotype.Component;
//import org.springframework.web.servlet.HandlerInterceptor;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// * Description:
// *
// * @author atroot@126.com  @ZYD
// * @create 2021.5.17 12:08
// */
//@Component
//public class RedisInterceptor implements HandlerInterceptor {
//    @Autowired
//    StringRedisTemplate redisTemplate;
//
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        String requestURI = request.getRequestURI();
//        redisTemplate.opsForValue().increment(requestURI);
//        return true;
//    }
//}
