package com.demand.driven.config;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;

@Slf4j
public class SignInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("preHandle, 请求路径{}, {}" ,request.getRequestURI(),JSONObject.toJSONString(request.getParameterMap()) );

//        BufferedReader br = request.getReader();
//        String str, wholeStr = "";
//        while((str = br.readLine()) != null){
//            wholeStr += str;
//        }
//        log.info("preHandle,请求数据BODY {}",wholeStr);

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        log.info("postHandle, {}" ,handler);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        log.info("afterCompletion, {}" ,handler);
    }
}
