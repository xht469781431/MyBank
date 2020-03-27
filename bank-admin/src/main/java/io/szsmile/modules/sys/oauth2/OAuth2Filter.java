/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package io.szsmile.modules.sys.oauth2;

import com.google.gson.Gson;
import io.szsmile.common.utils.HttpContextUtils;
import io.szsmile.common.utils.R;
import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpStatus;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.web.filter.authc.AuthenticatingFilter;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * oauth2过滤器   TODO shiro 应该是先走过滤器，然后走拦截器，通过过滤器获取request中的token，然后拦截器再拿到token进行授权和认证??
 *
 * 自定义OAuth2Filter：基于shiro的全局过滤器
 *
 * @author Mark sunlightcs@gmail.com
 */
public class OAuth2Filter extends AuthenticatingFilter {

    @Override
    protected AuthenticationToken createToken(ServletRequest request, ServletResponse response) throws Exception {
        //获取请求token
        String token = getRequestToken((HttpServletRequest) request);

        if(StringUtils.isBlank(token)){
            return null;
        }

        //这里返回的是我们自定义的OAuth2Token token对象
        //项目使用 OAuth2Token 类来作为 Shiro 的 token
        return new OAuth2Token(token);
    }

    @Override
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) {
        if(((HttpServletRequest) request).getMethod().equals(RequestMethod.OPTIONS.name())){
            return true;
        }

        return false;
    }

    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
        //获取请求token，如果token不存在，直接返回401
        String token = getRequestToken((HttpServletRequest) request);
        if(StringUtils.isBlank(token)){
            HttpServletResponse httpResponse = (HttpServletResponse) response;
            httpResponse.setHeader("Access-Control-Allow-Credentials", "true");
            httpResponse.setHeader("Access-Control-Allow-Origin", HttpContextUtils.getOrigin());

            String json = new Gson().toJson(R.error(HttpStatus.SC_UNAUTHORIZED, "invalid token"));

            httpResponse.getWriter().print(json);

            return false;
        }

        //至于 Shiro 是怎么判断这个 token 是否有效的，这里调用了executeLogin(request, response)方法，
        //通过查看声明处可以找到，这个方法是父类AuthenticatingFilter的方法，具体的内部实现，是调用了subject.login()方法实现登录
        return executeLogin(request, response);
    }

    @Override
    protected boolean onLoginFailure(AuthenticationToken token, AuthenticationException e, ServletRequest request, ServletResponse response) {
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        httpResponse.setContentType("application/json;charset=utf-8");
        httpResponse.setHeader("Access-Control-Allow-Credentials", "true");
        httpResponse.setHeader("Access-Control-Allow-Origin", HttpContextUtils.getOrigin());
        try {
            //处理登录失败的异常
            Throwable throwable = e.getCause() == null ? e : e.getCause();
            R r = R.error(HttpStatus.SC_UNAUTHORIZED, throwable.getMessage());

            String json = new Gson().toJson(r);
            httpResponse.getWriter().print(json);
        } catch (IOException e1) {

        }

        return false;
    }

    /**
     * 获取请求token
     */
    private String getRequestToken(HttpServletRequest httpRequest){
        //从http的请求头header中获取token
        String token = httpRequest.getHeader("token");

        //如果header中不存在token，则从参数中获取token
        if(StringUtils.isBlank(token)){
            token = httpRequest.getParameter("token");
        }

        return token;
    }

    //TODO 这个项目中没有用到这个方法 网上的参考博客：https://www.cnblogs.com/rigid/p/7514708.html
    //如果成功获得token 则继续调用父类中executeLogin方法，此方法实现如下
    //调用子类中的createToken方法获得token对象，将token对象赋值给shiro subject 对象，从而在后面的认证方法中获得token
//    @Override
//    protected boolean executeLogin(ServletRequest request, ServletResponse response) throws Exception {
//        AuthenticationToken token = createToken(request, response);
//        if (token == null) {
//            String msg = "createToken method implementation returned null. A valid non-null AuthenticationToken " +
//                    "must be created in order to execute a login attempt.";
//            throw new IllegalStateException(msg);
//        }
//        try {
//            //创建主题，然后继续调用Realm中的登入认证方法doGetAuthenticationInfo
//            Subject subject = getSubject(request, response);
//            subject.login(token);
//            return onLoginSuccess(token, subject, request, response);
//        } catch (AuthenticationException e) {
//            return onLoginFailure(token, e, request, response);
//        }
//    }


}
