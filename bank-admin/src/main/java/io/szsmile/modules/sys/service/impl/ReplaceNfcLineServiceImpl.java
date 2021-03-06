package io.szsmile.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.Query;

import io.szsmile.modules.sys.dao.ReplaceNfcLineDao;
import io.szsmile.modules.sys.entity.ReplaceNfcLineEntity;
import io.szsmile.modules.sys.service.ReplaceNfcLineService;


@Service("replaceNfcLineService")
public class ReplaceNfcLineServiceImpl extends ServiceImpl<ReplaceNfcLineDao, ReplaceNfcLineEntity> implements ReplaceNfcLineService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ReplaceNfcLineEntity> page = this.page(
                new Query<ReplaceNfcLineEntity>().getPage(params),
                new QueryWrapper<ReplaceNfcLineEntity>()
        );

        return new PageUtils(page);
    }

}