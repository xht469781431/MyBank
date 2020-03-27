package io.szsmile.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.Query;

import io.szsmile.modules.sys.dao.SysRolePermissionDao;
import io.szsmile.modules.sys.entity.SysRolePermissionEntity;
import io.szsmile.modules.sys.service.SysRolePermissionService;


@Service("sysRolePermissionService")
public class SysRolePermissionServiceImpl extends ServiceImpl<SysRolePermissionDao, SysRolePermissionEntity> implements SysRolePermissionService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SysRolePermissionEntity> page = this.page(
                new Query<SysRolePermissionEntity>().getPage(params),
                new QueryWrapper<SysRolePermissionEntity>()
        );

        return new PageUtils(page);
    }

}