package io.szsmile.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.modules.sys.entity.DistrictEntity;

import java.util.Map;

/**
 * 行政区
 *
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:42
 */
public interface DistrictService extends IService<DistrictEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

