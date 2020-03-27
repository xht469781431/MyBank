package io.szsmile.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.Query;

import io.szsmile.modules.sys.dao.GoodCategoryDao;
import io.szsmile.modules.sys.entity.GoodCategoryEntity;
import io.szsmile.modules.sys.service.GoodCategoryService;


@Service("goodCategoryService")
public class GoodCategoryServiceImpl extends ServiceImpl<GoodCategoryDao, GoodCategoryEntity> implements GoodCategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<GoodCategoryEntity> page = this.page(
                new Query<GoodCategoryEntity>().getPage(params),
                new QueryWrapper<GoodCategoryEntity>()
        );

        return new PageUtils(page);
    }

}