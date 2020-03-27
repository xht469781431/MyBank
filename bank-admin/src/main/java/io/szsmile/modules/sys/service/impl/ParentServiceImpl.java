package io.szsmile.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.Query;

import io.szsmile.modules.sys.dao.ParentDao;
import io.szsmile.modules.sys.entity.ParentEntity;
import io.szsmile.modules.sys.service.ParentService;


@Service("parentService")
public class ParentServiceImpl extends ServiceImpl<ParentDao, ParentEntity> implements ParentService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ParentEntity> page = this.page(
                new Query<ParentEntity>().getPage(params),
                new QueryWrapper<ParentEntity>()
        );

        return new PageUtils(page);
    }

}