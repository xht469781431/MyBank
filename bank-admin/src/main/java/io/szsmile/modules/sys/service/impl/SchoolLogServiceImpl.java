package io.szsmile.modules.sys.service.impl;

import io.szsmile.modules.sys.dao.SchoolLogDao;
import io.szsmile.modules.sys.service.SchoolLogService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.Query;

import io.szsmile.modules.sys.entity.SchoolLogEntity;


@Service("schoolLogService")
public class SchoolLogServiceImpl extends ServiceImpl<SchoolLogDao, SchoolLogEntity> implements SchoolLogService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SchoolLogEntity> page = this.page(
                new Query<SchoolLogEntity>().getPage(params),
                new QueryWrapper<SchoolLogEntity>()
        );

        return new PageUtils(page);
    }

}