/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package io.szsmile.modules.sys.form;

import lombok.Data;

/**
 * 登录表单
 *
 * @author Mark sunlightcs@gmail.com
 */
@Data
public class SysLoginForm {
    //登录名
    private String username;
    //密码
    private String password;
    //验证码
    private String captcha;

    private String uuid;


}
