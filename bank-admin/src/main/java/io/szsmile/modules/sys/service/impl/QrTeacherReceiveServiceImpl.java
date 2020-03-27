package io.szsmile.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.Query;

import io.szsmile.modules.sys.dao.QrTeacherReceiveDao;
import io.szsmile.modules.sys.entity.QrTeacherReceiveEntity;
import io.szsmile.modules.sys.service.QrTeacherReceiveService;


@Service("qrTeacherReceiveService")
public class QrTeacherReceiveServiceImpl extends ServiceImpl<QrTeacherReceiveDao, QrTeacherReceiveEntity> implements QrTeacherReceiveService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<QrTeacherReceiveEntity> page = this.page(
                new Query<QrTeacherReceiveEntity>().getPage(params),
                new QueryWrapper<QrTeacherReceiveEntity>()
        );

        return new PageUtils(page);
    }

}