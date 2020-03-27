package io.szsmile.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.modules.sys.entity.SysRolePermissionEntity;

import java.util.Map;

/**
 * 系统用户角色权限表
 *
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:42
 */
public interface SysRolePermissionService extends IService<SysRolePermissionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

