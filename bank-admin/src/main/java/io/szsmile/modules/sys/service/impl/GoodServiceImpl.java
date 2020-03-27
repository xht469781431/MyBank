package io.szsmile.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.Query;

import io.szsmile.modules.sys.dao.GoodDao;
import io.szsmile.modules.sys.entity.GoodEntity;
import io.szsmile.modules.sys.service.GoodService;


@Service("goodService")
public class GoodServiceImpl extends ServiceImpl<GoodDao, GoodEntity> implements GoodService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<GoodEntity> page = this.page(
                new Query<GoodEntity>().getPage(params),
                new QueryWrapper<GoodEntity>()
        );

        return new PageUtils(page);
    }

}