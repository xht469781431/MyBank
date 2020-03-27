package io.szsmile.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.Query;

import io.szsmile.modules.sys.dao.GoodStockDao;
import io.szsmile.modules.sys.entity.GoodStockEntity;
import io.szsmile.modules.sys.service.GoodStockService;


@Service("goodStockService")
public class GoodStockServiceImpl extends ServiceImpl<GoodStockDao, GoodStockEntity> implements GoodStockService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<GoodStockEntity> page = this.page(
                new Query<GoodStockEntity>().getPage(params),
                new QueryWrapper<GoodStockEntity>()
        );

        return new PageUtils(page);
    }

}