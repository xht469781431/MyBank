package io.szsmile.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.Query;

import io.szsmile.modules.sys.dao.TransferLineDao;
import io.szsmile.modules.sys.entity.TransferLineEntity;
import io.szsmile.modules.sys.service.TransferLineService;


@Service("transferLineService")
public class TransferLineServiceImpl extends ServiceImpl<TransferLineDao, TransferLineEntity> implements TransferLineService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TransferLineEntity> page = this.page(
                new Query<TransferLineEntity>().getPage(params),
                new QueryWrapper<TransferLineEntity>()
        );

        return new PageUtils(page);
    }

}