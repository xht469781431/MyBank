/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package io.szsmile.modules.sys.oauth2;


import org.apache.shiro.authc.AuthenticationToken;

/**
 * 自定义token类OAuth2Token，实现AuthenticationToken接口
 *
 *
 * Shiro 用户认证个性化修改：
 * 如果AuthenticationToken的元素不满足实际情况，列入登陆的时候需要有学校id或者 其他参数，这时需要进行扩展，主要修改的地方有以下：
 * 参考：https://blog.csdn.net/a3111300/article/details/79076499?depth_1-utm_source=distribute.pc_relevant.none-task&utm_source=distribute.pc_relevant.none-task
 *
 * AuthenticationToken 用于收集用户提交的身份（如用户名）及凭据（如密码）
 * 补充：
 *1、扩展接口RememberMeAuthenticationToken：提供了“boolean isRememberMe()”现“记住我”的功能；
 *2、扩展接口是HostAuthenticationToken：提供了“String getHost()”方法用于获取用户“主机”的功能。
 *3、hiro 提供了一个直接拿来用的UsernamePasswordToken，用于实现用户名/密码Token组，另外其实现了RememberMeAuthenticationToken和HostAuthenticationToken，可以实现记住我及主机验证的支持。

 * @author Mark sunlightcs@gmail.com
 */
public class OAuth2Token implements AuthenticationToken {

    private String token;

    public OAuth2Token(String token){ //构造函数
        this.token = token;
    }

    /**
     * 重写getPrincipal方法 返回token
     * @return
     */
    @Override
    public String getPrincipal() {  //获取身份
        return token;
    }

    /**
     * 重写getCredentials方法 返回token
     * @return
     */
    @Override
    public Object getCredentials() {  //获取凭证
        return token;
    }
}
