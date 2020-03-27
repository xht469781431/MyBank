package io.szsmile.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.modules.sys.entity.OrderDetailEntity;

import java.util.Map;

/**
 * 商品销售明细表
 *
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:26
 */
public interface OrderDetailService extends IService<OrderDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

