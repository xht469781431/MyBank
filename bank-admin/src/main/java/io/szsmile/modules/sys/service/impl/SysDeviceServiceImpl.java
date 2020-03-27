package io.szsmile.modules.sys.service.impl;

import io.szsmile.modules.sys.dao.SysDeviceDao;
import io.szsmile.modules.sys.service.SysDeviceService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.Query;

import io.szsmile.modules.sys.entity.SysDeviceEntity;


@Service("sysDeviceService")
public class SysDeviceServiceImpl extends ServiceImpl<SysDeviceDao, SysDeviceEntity> implements SysDeviceService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SysDeviceEntity> page = this.page(
                new Query<SysDeviceEntity>().getPage(params),
                new QueryWrapper<SysDeviceEntity>()
        );

        return new PageUtils(page);
    }

}