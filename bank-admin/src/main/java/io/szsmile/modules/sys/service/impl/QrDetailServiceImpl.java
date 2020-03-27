package io.szsmile.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.Query;

import io.szsmile.modules.sys.dao.QrDetailDao;
import io.szsmile.modules.sys.entity.QrDetailEntity;
import io.szsmile.modules.sys.service.QrDetailService;


@Service("qrDetailService")
public class QrDetailServiceImpl extends ServiceImpl<QrDetailDao, QrDetailEntity> implements QrDetailService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<QrDetailEntity> page = this.page(
                new Query<QrDetailEntity>().getPage(params),
                new QueryWrapper<QrDetailEntity>()
        );

        return new PageUtils(page);
    }

}