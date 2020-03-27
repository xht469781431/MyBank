package io.szsmile.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.Query;

import io.szsmile.modules.sys.dao.StudentParentDao;
import io.szsmile.modules.sys.entity.StudentParentEntity;
import io.szsmile.modules.sys.service.StudentParentService;


@Service("studentParentService")
public class StudentParentServiceImpl extends ServiceImpl<StudentParentDao, StudentParentEntity> implements StudentParentService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<StudentParentEntity> page = this.page(
                new Query<StudentParentEntity>().getPage(params),
                new QueryWrapper<StudentParentEntity>()
        );

        return new PageUtils(page);
    }

}