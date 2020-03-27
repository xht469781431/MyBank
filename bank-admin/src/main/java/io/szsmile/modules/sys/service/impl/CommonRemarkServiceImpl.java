package io.szsmile.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.Query;

import io.szsmile.modules.sys.dao.CommonRemarkDao;
import io.szsmile.modules.sys.entity.CommonRemarkEntity;
import io.szsmile.modules.sys.service.CommonRemarkService;


@Service("commonRemarkService")
public class CommonRemarkServiceImpl extends ServiceImpl<CommonRemarkDao, CommonRemarkEntity> implements CommonRemarkService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CommonRemarkEntity> page = this.page(
                new Query<CommonRemarkEntity>().getPage(params),
                new QueryWrapper<CommonRemarkEntity>()
        );

        return new PageUtils(page);
    }

}