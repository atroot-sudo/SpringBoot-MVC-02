package com.atroot.admin.config;

import com.atroot.admin.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Description:自定义拦截器
 *
 * 1、编写一个拦截器实例HandlerInterceptor接口
 * 2、拦截器注册到容器中，并实现WebMvcConfigurer的addInterceptors
 * 3、指定拦截规则(如果是拦截所有的话，那么静态资源也会被拦截，可以使用精确拦截或者排除拦截项)
 *
 * @author atroot@126.com  @ZYD
 * @create 2021.5.9 16:58
 */
@Configuration
public class AdminWebConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/","/login","/css/**","/fonts/**","/images/**","/js/**");
    }
}
