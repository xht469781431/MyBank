/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package io.szsmile.modules.sys.oauth2;


import io.szsmile.modules.sys.entity.SysUserEntity;
import io.szsmile.modules.sys.entity.utilEntity.SysUserTokenEntity;
import io.szsmile.modules.sys.service.ShiroService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * 认证
 *自定义OAuth2Realm继承AuthorizingRealm
 *
 *每次请求都会先调用OAuth2Realm中的doGetAuthenticationInfo方法验证token的合法性，
 * 然后再调用doGetAuthorizationInfo验证权限
 *
 * @author Mark sunlightcs@gmail.com
 */
@Component
public class OAuth2Realm extends AuthorizingRealm {

    @Autowired
    private ShiroService shiroService;

    /**
     * Realm类需要实现一个support方法,以让shiro识别这个AuthenticationToken的子类
     * @param token
     * @return
     */
    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof OAuth2Token;
    }



    /**
     * 认证(登录时调用)  我的理解主要是拦截器拦截访问的url,判断url中的token
     * 逻辑：先拿到了之前用户登录过后，保存到 header 中的 token，然后根据这个 token 去数据库查对应的用户
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        //这里的AuthenticationToken token 应该就是我们定义的OAuth2Token了，然后调用重写的getPrincipal()方法获取token
        String accessToken = (String) token.getPrincipal();

        //根据accessToken，查询用户信息        根据token,从数据库查询token对象，获取token对象中存在的userId，然后通过userId查询出用户对象
        SysUserTokenEntity tokenEntity = shiroService.queryByToken(accessToken);
        //token失效
        if(tokenEntity == null || tokenEntity.getExpireTime().getTime() < System.currentTimeMillis()){
            throw new IncorrectCredentialsException("token失效，请重新登录");
        }

        //查询用户信息
        SysUserEntity user = shiroService.queryUser(tokenEntity.getUserId());
        //账号锁定
        if(user.getStatus() == 0){
            throw new LockedAccountException("账号已被锁定,请联系管理员");
        }

        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user, accessToken, getName());
        return info;
    }

    /**
     * 授权(验证权限时调用) 我的理解主要是拦截器拦截controller层方法上的@RequiresPermissions，使用aop获取注解内的权限值是否与从数据库查询出来的用户权限相匹配或者存在
     * 授权依然是在数据库中获取权限的
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        SysUserEntity user = (SysUserEntity)principals.getPrimaryPrincipal();
        Integer userId = user.getId();

        //用户权限列表
        Set<String> permsSet = shiroService.getUserPermissions(userId);

        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.setStringPermissions(permsSet);
        return info;
    }


    /**
     * 梳理登录和认证的流程：
     * 1、用户登录，调用SysLoginController.login()方法
     * 2、浏览器保存返回的 token
     * 3、用户拿这个 token 去访问网站
     * 4、请求被 OAuth2Filter 过滤器拦截，因为没有在 Shiro 登录，访问禁止，调用 OAuth2Filter.onAccessDenied(ServletRequest request, ServletResponse response)方法
     * 5、在OAuth2Filter.onAccessDenied方法中执行登录，此时调用 OAuth2Realm 的doGetAuthenticationInfo(AuthenticationToken token)方法，查询数据库 token 对应的用户
     * 6、完成登录，后面访问不会再被拦截
     *
     */




    /**
     * 梳理一下授权流程：
     * 1、登录成功后， Shiro 保存用户的权限信息
     * 2、用户在试图请求一个带@RequiresPermissions的方法，会被AuthorizationAttributeSourceAdvisor拦截
     * 3、AuthorizationAttributeSourceAdvisor添加了PermissionAnnotationMethodInterceptor拦截器，判断用户是否具备权限
     * 4、具备权限则放行，不具备则抛出AuthorizationException
     * 5、当抛出AuthorizationException时，处理该异常，给用户友好提示
     *
     */
}
