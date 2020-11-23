//package com.test2.demo.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistration;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class MyWebMvcConfigurerAdapter implements WebMvcConfigurer {
//    @Autowired
//    private UserIDHandlerInterceptor userIDHandlerInterceptor;
//
//    /**
//     * addPathPatterns 添加拦截规则
//     * excludePathPatterns 排除拦截规则
//     *
//     * @param registry
//     */
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(userIDHandlerInterceptor).addPathPatterns("/**/*");
//    }
//
//}
