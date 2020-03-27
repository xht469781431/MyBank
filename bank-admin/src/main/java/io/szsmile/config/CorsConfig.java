/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package io.szsmile.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *  CORS全局配置类，解决跨域请求问题，也可以定义filter过滤器配置全局CORS
 *  (mvc配置)
 */
@Configuration
public class CorsConfig implements WebMvcConfigurer {

    /**
     * 解决跨域问题
     * @param registry
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        ////配置允许跨域访问的路径
        registry.addMapping("/**")
            .allowedOrigins("*") //浏览器允许所有的域访问 / 注意 * 不能满足带有cookie的访问,Origin 必须是全匹配
            .allowCredentials(true) // // 允许带cookie访问
            .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
            .maxAge(3600);
    }
}

/**
 *Spring 中对 CORS 规则的校验，都是通过委托给 DefaultCorsProcessor实现的。
 *
 * DefaultCorsProcessor 处理过程如下：
 *
 * 判断依据是 Header中是否包含 Origin。如果包含则说明为 CORS请求，转到 2；否则，说明不是 CORS 请求，不作任何处理。
 * 判断 response 的 Header 是否已经包含 Access-Control-Allow-Origin，如果包含，证明已经被处理过了, 转到 3，否则不再处理。
 * 判断是否同源，如果是则转交给负责该请求的类处理
 * 是否配置了 CORS 规则，如果没有配置，且是预检请求，则拒绝该请求，如果没有配置，且不是预检请求，则交给负责该请求的类处理。如果配置了，则对该请求进行校验。
 * 校验就是根据 CorsConfiguration 这个类的配置进行判断：
 *
 * 判断 origin 是否合法
 * 判断 method 是否合法
 * 判断 header是否合法
 * 如果全部合法，则在 response header中添加响应的字段，并交给负责该请求的类处理，如果不合法，则拒绝该请求。
 *
 * 原文链接：https://blog.csdn.net/weixin_36276193/article/details/83870241
 *
 **/

       /**
        *WebMvcConfigurer MVC配置常用的几种配置方法
        *
        * 解决跨域问题
        *public void addCorsMappings(CorsRegistry registry);
        *
        *添加拦截器
        *void addInterceptors(InterceptorRegistry registry);
        *
        * 这里配置视图解析器
        *void configureViewResolvers(ViewResolverRegistry registry);
        *
        *配置内容裁决的一些选项
        *void configureContentNegotiation(ContentNegotiationConfigurer configurer);
        *
        *视图跳转控制器
        *void addViewControllers(ViewControllerRegistry registry);
        *
        * 静态资源处理
        *void addResourceHandlers(ResourceHandlerRegistry registry);
        *
        *默认静态资源处理器
        *void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer);
        **/