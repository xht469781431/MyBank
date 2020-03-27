package io.szsmile.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.Query;

import io.szsmile.modules.sys.dao.RelativeDao;
import io.szsmile.modules.sys.entity.RelativeEntity;
import io.szsmile.modules.sys.service.RelativeService;


@Service("relativeService")
public class RelativeServiceImpl extends ServiceImpl<RelativeDao, RelativeEntity> implements RelativeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<RelativeEntity> page = this.page(
                new Query<RelativeEntity>().getPage(params),
                new QueryWrapper<RelativeEntity>()
        );

        return new PageUtils(page);
    }

}