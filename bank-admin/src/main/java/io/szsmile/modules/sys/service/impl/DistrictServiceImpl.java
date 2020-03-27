package io.szsmile.modules.sys.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.Query;

import io.szsmile.modules.sys.dao.DistrictDao;
import io.szsmile.modules.sys.entity.DistrictEntity;
import io.szsmile.modules.sys.service.DistrictService;


@Service("districtService")
public class DistrictServiceImpl extends ServiceImpl<DistrictDao, DistrictEntity> implements DistrictService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<DistrictEntity> page = this.page(
                new Query<DistrictEntity>().getPage(params),
                new QueryWrapper<DistrictEntity>()
        );

        return new PageUtils(page);
    }

}