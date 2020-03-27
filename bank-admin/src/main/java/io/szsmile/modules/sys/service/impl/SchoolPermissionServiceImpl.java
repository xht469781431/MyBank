package io.szsmile.modules.sys.service.impl;

import io.szsmile.modules.sys.dao.SchoolPermissionDao;
import io.szsmile.modules.sys.service.SchoolPermissionService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.Query;

import io.szsmile.modules.sys.entity.SchoolPermissionEntity;


@Service("schoolPermissionService")
public class SchoolPermissionServiceImpl extends ServiceImpl<SchoolPermissionDao, SchoolPermissionEntity> implements SchoolPermissionService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SchoolPermissionEntity> page = this.page(
                new Query<SchoolPermissionEntity>().getPage(params),
                new QueryWrapper<SchoolPermissionEntity>()
        );

        return new PageUtils(page);
    }

}