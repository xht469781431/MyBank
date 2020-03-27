/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package io.szsmile.common.utils;

import io.szsmile.common.exception.RRException;
import io.szsmile.modules.sys.entity.SysUserEntity;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;

/**
 * Shiro工具类
 *
 * @author Mark sunlightcs@gmail.com
 */
public class ShiroUtils {

    /**
     *  获取session对象
     * @return
     */
	public static Session getSession() {
		return SecurityUtils.getSubject().getSession();
	}

    /**
     * 获取subject对象
     * @return
     */
	public static Subject getSubject() {
		return SecurityUtils.getSubject();
	}

    /**
     * 获取当前用户
     * @return
     */
	public static SysUserEntity getUserEntity() {
		return (SysUserEntity)SecurityUtils.getSubject().getPrincipal();
	}

    /**
     * 获取当前用户的ID
     * @return
     */
	public static Integer getUserId() {
		return getUserEntity().getId();
	}

    /**
     * 将key,vlaue 存入session
     * @param key
     * @param value
     */
	public static void setSessionAttribute(Object key, Object value) {
		getSession().setAttribute(key, value);
	}

    /**
     * 通过key,从session中取出value对象
     * @param key
     * @return
     */
	public static Object getSessionAttribute(Object key) {
		return getSession().getAttribute(key);
	}

    /**
     * 判断用户是否登录
     * @return
     */
	public static boolean isLogin() {
		return SecurityUtils.getSubject().getPrincipal() != null;
	}

    /**
     * 判断session中的验证码是否失效
    * @param key
     * @return
     */
	public static String getKaptcha(String key) {
		Object kaptcha = getSessionAttribute(key);
		if(kaptcha == null){
			throw new RRException("验证码已失效");
		}
		getSession().removeAttribute(key);
		return kaptcha.toString();
	}

}
