/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package io.szsmile.modules.sys.controller;


import io.szsmile.modules.sys.entity.SysUserEntity;
import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Controller公共组件抽象类
 *
 * @author Mark sunlightcs@gmail.com
 */
public abstract class AbstractController {

	protected Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 获得登录用户信息
     * @return
     */
	protected SysUserEntity getUser() {
		return (SysUserEntity) SecurityUtils.getSubject().getPrincipal();
	}

    /**
     * 获得用户ID
     * @return
     */
	protected Integer getUserId() {
		return getUser().getId();
	}
}
