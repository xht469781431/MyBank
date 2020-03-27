package io.szsmile.modules.sys.service.impl;

import io.szsmile.modules.sys.dao.GcStockLineDao;
import io.szsmile.modules.sys.service.GcStockLineService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.Query;

import io.szsmile.modules.sys.entity.GcStockLineEntity;


@Service("gcStockLineService")
public class GcStockLineServiceImpl extends ServiceImpl<GcStockLineDao, GcStockLineEntity> implements GcStockLineService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<GcStockLineEntity> page = this.page(
                new Query<GcStockLineEntity>().getPage(params),
                new QueryWrapper<GcStockLineEntity>()
        );

        return new PageUtils(page);
    }

}