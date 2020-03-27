package io.szsmile.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.Query;

import io.szsmile.modules.sys.dao.SchoolRoleDao;
import io.szsmile.modules.sys.entity.SchoolRoleEntity;
import io.szsmile.modules.sys.service.SchoolRoleService;


@Service("schoolRoleService")
public class SchoolRoleServiceImpl extends ServiceImpl<SchoolRoleDao, SchoolRoleEntity> implements SchoolRoleService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SchoolRoleEntity> page = this.page(
                new Query<SchoolRoleEntity>().getPage(params),
                new QueryWrapper<SchoolRoleEntity>()
        );

        return new PageUtils(page);
    }

}