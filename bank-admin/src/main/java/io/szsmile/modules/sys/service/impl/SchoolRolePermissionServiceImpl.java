package io.szsmile.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.Query;

import io.szsmile.modules.sys.dao.SchoolRolePermissionDao;
import io.szsmile.modules.sys.entity.SchoolRolePermissionEntity;
import io.szsmile.modules.sys.service.SchoolRolePermissionService;


@Service("schoolRolePermissionService")
public class SchoolRolePermissionServiceImpl extends ServiceImpl<SchoolRolePermissionDao, SchoolRolePermissionEntity> implements SchoolRolePermissionService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SchoolRolePermissionEntity> page = this.page(
                new Query<SchoolRolePermissionEntity>().getPage(params),
                new QueryWrapper<SchoolRolePermissionEntity>()
        );

        return new PageUtils(page);
    }

}