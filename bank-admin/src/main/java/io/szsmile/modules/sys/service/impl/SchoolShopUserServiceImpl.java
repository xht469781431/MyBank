package io.szsmile.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.Query;

import io.szsmile.modules.sys.dao.SchoolShopUserDao;
import io.szsmile.modules.sys.entity.SchoolShopUserEntity;
import io.szsmile.modules.sys.service.SchoolShopUserService;


@Service("schoolShopUserService")
public class SchoolShopUserServiceImpl extends ServiceImpl<SchoolShopUserDao, SchoolShopUserEntity> implements SchoolShopUserService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SchoolShopUserEntity> page = this.page(
                new Query<SchoolShopUserEntity>().getPage(params),
                new QueryWrapper<SchoolShopUserEntity>()
        );

        return new PageUtils(page);
    }

}