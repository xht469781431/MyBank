package io.szsmile.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.Query;

import io.szsmile.modules.sys.dao.SchoolClassDao;
import io.szsmile.modules.sys.entity.SchoolClassEntity;
import io.szsmile.modules.sys.service.SchoolClassService;


@Service("schoolClassService")
public class SchoolClassServiceImpl extends ServiceImpl<SchoolClassDao, SchoolClassEntity> implements SchoolClassService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SchoolClassEntity> page = this.page(
                new Query<SchoolClassEntity>().getPage(params),
                new QueryWrapper<SchoolClassEntity>()
        );

        return new PageUtils(page);
    }

}