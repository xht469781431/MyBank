package io.szsmile.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.modules.sys.entity.SchoolUserEntity;

import java.util.Map;

/**
 * 学校后管用户表
 *
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:42
 */
public interface SchoolUserService extends IService<SchoolUserEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

