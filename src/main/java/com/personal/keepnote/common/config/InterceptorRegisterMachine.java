//package com.personal.keepnote.common.config;
//
//import com.personal.keepnote.common.interceptor.SessionInterceptor;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
//
///**
// * @author admin
// */
//@Configuration
//@EnableWebMvc
//public class InterceptorRegisterMachine implements WebMvcConfigurer {
//    /**
//     * 拦截器注册机
//     *
//     * @param registry
//     */
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
////        registry.addInterceptor(new SessionInterceptor()).addPathPatterns("/**").excludePathPatterns("/user/login").excludePathPatterns("/user/register");
////        registry.addInterceptor(new SessionInterceptor());
////        registry.addInterceptor(new ThemeChangeInterceptor()).addPathPatterns("/**").excludePathPatterns("/admin/**");
////        registry.addInterceptor(new SecurityInterceptor()).addPathPatterns("/secure/*");
//    }
//}