package io.szsmile.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.Query;

import io.szsmile.modules.sys.dao.OrderDetailDao;
import io.szsmile.modules.sys.entity.OrderDetailEntity;
import io.szsmile.modules.sys.service.OrderDetailService;


@Service("orderDetailService")
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailDao, OrderDetailEntity> implements OrderDetailService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OrderDetailEntity> page = this.page(
                new Query<OrderDetailEntity>().getPage(params),
                new QueryWrapper<OrderDetailEntity>()
        );

        return new PageUtils(page);
    }

}