package io.szsmile.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.Query;

import io.szsmile.modules.sys.dao.TeacherDao;
import io.szsmile.modules.sys.entity.TeacherEntity;
import io.szsmile.modules.sys.service.TeacherService;


@Service("teacherService")
public class TeacherServiceImpl extends ServiceImpl<TeacherDao, TeacherEntity> implements TeacherService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TeacherEntity> page = this.page(
                new Query<TeacherEntity>().getPage(params),
                new QueryWrapper<TeacherEntity>()
        );

        return new PageUtils(page);
    }

}