package io.szsmile.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.Query;

import io.szsmile.modules.sys.dao.SubjectDao;
import io.szsmile.modules.sys.entity.SubjectEntity;
import io.szsmile.modules.sys.service.SubjectService;


@Service("subjectService")
public class SubjectServiceImpl extends ServiceImpl<SubjectDao, SubjectEntity> implements SubjectService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SubjectEntity> page = this.page(
                new Query<SubjectEntity>().getPage(params),
                new QueryWrapper<SubjectEntity>()
        );

        return new PageUtils(page);
    }

}