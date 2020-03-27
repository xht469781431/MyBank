package io.szsmile.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.Query;

import io.szsmile.modules.sys.dao.SysPermissionDao;
import io.szsmile.modules.sys.entity.SysPermissionEntity;
import io.szsmile.modules.sys.service.SysPermissionService;


@Service("sysPermissionService")
public class SysPermissionServiceImpl extends ServiceImpl<SysPermissionDao, SysPermissionEntity> implements SysPermissionService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SysPermissionEntity> page = this.page(
                new Query<SysPermissionEntity>().getPage(params),
                new QueryWrapper<SysPermissionEntity>()
        );

        return new PageUtils(page);
    }

}