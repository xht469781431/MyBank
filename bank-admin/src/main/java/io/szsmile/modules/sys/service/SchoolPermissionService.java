package io.szsmile.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.modules.sys.entity.SchoolPermissionEntity;

import java.util.Map;

/**
 * 学校用户权限表
 *
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:10
 */
public interface SchoolPermissionService extends IService<SchoolPermissionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

