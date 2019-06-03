package com.interceptor;


import com.pojo.UserInfo;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {

    //前置处理
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        //获取请求的uri
        String requestURI = httpServletRequest.getRequestURI();
        System.out.println(requestURI);
        //判断是否为登录页面或注册页面
        if (requestURI.equals("/login.html") || requestURI.equals("/reg.html")){
            return true;
        }
        //登录成功后 拿session 对后面的页面放行
        UserInfo userinfo = (UserInfo) httpServletRequest.getSession().getAttribute("UserInfo");
        if (userinfo!=null){
            return true;
        }

        return false;
    }
    //请求处理
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }
    //后置处理
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
