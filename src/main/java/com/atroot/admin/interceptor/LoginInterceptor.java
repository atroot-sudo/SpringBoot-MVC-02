package com.atroot.admin.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Description: 自定义拦截器
 * 拦截器的原理
 * 1、根据当前请求，找到扫HandlerExecutionChain【可以处理handler以及handler的所有拦截器】
 * 2、先来顺序执行所有拦截器的preHandle方法
 *      如果当前拦截器的preHandle返回值为true，则执行下一个拦截器的preHandle
 *      如果当前拦截器返回为false，那么直接倒叙执行已经执行了的拦截其的afterCompletion
 * 3、如果任何一个拦截器但会false，直接跳出不执行目标方法
 * 4、所有拦截器都返回true，则执行目标方法
 * 5、倒叙执行所有的拦截其的postHandle方法
 * 6、前面的步骤有任何异常都会导致直接出发倒叙的afterCompletion
 * 7、页面成功渲染完成之后，也会出发倒叙的afterCompletion
 *
 * @author atroot@126.com  @ZYD
 * @create 2021.5.9 17:01
 */
@Slf4j
public class LoginInterceptor implements HandlerInterceptor {
    /**
     * 目标方法执行之前-前置环绕通知
     *
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        log.info("拦截请求是{}",request.getRequestURI());
        log.info("现在执行的是：{preHandle}");
        HttpSession session = request.getSession();
        Object loginUser = session.getAttribute("loginUser");
        if (loginUser != null) {
            return true;
        }
//        response.sendRedirect("/");  //无法携带数据
        request.setAttribute("msg","未登录，请登录后再试！");
        request.getRequestDispatcher("/").forward(request,response);
        return false;
    }

    /**
     * 目标方法执行之后-后置环绕通知
     *
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        log.info("现在执行的是：{postHandle}");
    }

    /**
     * 页面渲染之后
     *
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        log.info("现在执行的是：{afterCompletion}");

    }
}
