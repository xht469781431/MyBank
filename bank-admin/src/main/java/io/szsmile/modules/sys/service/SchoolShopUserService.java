package io.szsmile.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.modules.sys.entity.SchoolShopUserEntity;

import java.util.Map;

/**
 * 商场操作员表
 *
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:35
 */
public interface SchoolShopUserService extends IService<SchoolShopUserEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

