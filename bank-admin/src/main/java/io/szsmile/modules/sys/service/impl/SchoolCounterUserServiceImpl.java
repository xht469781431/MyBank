package io.szsmile.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.Query;

import io.szsmile.modules.sys.dao.SchoolCounterUserDao;
import io.szsmile.modules.sys.entity.SchoolCounterUserEntity;
import io.szsmile.modules.sys.service.SchoolCounterUserService;


@Service("schoolCounterUserService")
public class SchoolCounterUserServiceImpl extends ServiceImpl<SchoolCounterUserDao, SchoolCounterUserEntity> implements SchoolCounterUserService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SchoolCounterUserEntity> page = this.page(
                new Query<SchoolCounterUserEntity>().getPage(params),
                new QueryWrapper<SchoolCounterUserEntity>()
        );

        return new PageUtils(page);
    }

}