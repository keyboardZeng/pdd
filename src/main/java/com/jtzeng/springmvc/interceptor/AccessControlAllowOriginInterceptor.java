package com.jtzeng.springmvc.interceptor;

import com.pdd.pop.ext.apache.http.HttpStatus;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AccessControlAllowOriginInterceptor implements HandlerInterceptor {
    //请求执行方法之前执行
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        System.out.println("MyIntercpetor.preHandle()");
        String originHeader=((HttpServletRequest) request).getHeader("Origin");
        response.setHeader("Access-Control-Allow-Origin", originHeader);
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "content-type, x-requested-with");
        response.setHeader("Access-Control-Allow-Credentials", "true");

        if ("OPTIONS".equals(request.getMethod()))
        {
            response.setStatus(200);
            return false;
        }
        return true;
    }
    //执行方法之后执行
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        System.out.println("MyIntercpetor.postHandle()");

    }
    //最终执行的方法
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        System.out.println("MyIntercpetor.afterCompletion()");

    }

}