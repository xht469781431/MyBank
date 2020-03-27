package io.szsmile.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.Query;

import io.szsmile.modules.sys.dao.SchoolGradeDao;
import io.szsmile.modules.sys.entity.SchoolGradeEntity;
import io.szsmile.modules.sys.service.SchoolGradeService;


@Service("schoolGradeService")
public class SchoolGradeServiceImpl extends ServiceImpl<SchoolGradeDao, SchoolGradeEntity> implements SchoolGradeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SchoolGradeEntity> page = this.page(
                new Query<SchoolGradeEntity>().getPage(params),
                new QueryWrapper<SchoolGradeEntity>()
        );

        return new PageUtils(page);
    }

}