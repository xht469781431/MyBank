package io.szsmile.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.Query;

import io.szsmile.modules.sys.dao.SchoolUserDao;
import io.szsmile.modules.sys.entity.SchoolUserEntity;
import io.szsmile.modules.sys.service.SchoolUserService;


@Service("schoolUserService")
public class SchoolUserServiceImpl extends ServiceImpl<SchoolUserDao, SchoolUserEntity> implements SchoolUserService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SchoolUserEntity> page = this.page(
                new Query<SchoolUserEntity>().getPage(params),
                new QueryWrapper<SchoolUserEntity>()
        );

        return new PageUtils(page);
    }

}