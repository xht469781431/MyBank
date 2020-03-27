package io.szsmile.modules.sys.service.impl;

import io.szsmile.modules.sys.dao.StockLineDao;
import io.szsmile.modules.sys.service.StockLineService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.Query;

import io.szsmile.modules.sys.entity.StockLineEntity;


@Service("stockLineService")
public class StockLineServiceImpl extends ServiceImpl<StockLineDao, StockLineEntity> implements StockLineService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<StockLineEntity> page = this.page(
                new Query<StockLineEntity>().getPage(params),
                new QueryWrapper<StockLineEntity>()
        );

        return new PageUtils(page);
    }

}