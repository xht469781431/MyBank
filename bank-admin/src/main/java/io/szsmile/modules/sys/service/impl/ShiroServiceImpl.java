/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package io.szsmile.modules.sys.service.impl;


import io.szsmile.common.utils.Constant;
import io.szsmile.modules.sys.dao.SysUserDao;
import io.szsmile.modules.sys.dao.SysUserTokenDao;
import io.szsmile.modules.sys.entity.SysUserEntity;
import io.szsmile.modules.sys.entity.utilEntity.SysUserTokenEntity;
import io.szsmile.modules.sys.service.ShiroService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ShiroServiceImpl implements ShiroService {
//    @Autowired
//    private SysMenuDao sysMenuDao;
    @Autowired
    private SysUserDao sysUserDao;
    @Autowired
    private SysUserTokenDao sysUserTokenDao;

    @Override
    public Set<String> getUserPermissions(Integer userId) {
        Set<String> permsList = null;

        //...

        return permsList;
    }

    @Override
    public SysUserTokenEntity queryByToken(String token) {
        return sysUserTokenDao.queryByToken(token);
    }

    @Override
    public SysUserEntity queryUser(Integer userId) {
        return sysUserDao.selectById(userId);
    }
}
