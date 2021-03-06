package io.szsmile.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.modules.sys.entity.GoodEntity;

import java.util.Map;

/**
 * 商品表
 *
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:34
 */
public interface GoodService extends IService<GoodEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

