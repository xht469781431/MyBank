package io.szsmile.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.modules.sys.entity.StockLineEntity;

import java.util.Map;

/**
 * 商品库存变动流水表
 *
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:10
 */
public interface StockLineService extends IService<StockLineEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

