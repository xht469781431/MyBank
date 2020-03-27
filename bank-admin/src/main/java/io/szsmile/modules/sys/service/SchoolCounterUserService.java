package io.szsmile.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.modules.sys.entity.SchoolCounterUserEntity;

import java.util.Map;

/**
 * 柜台操作员表
 *
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:26
 */
public interface SchoolCounterUserService extends IService<SchoolCounterUserEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

