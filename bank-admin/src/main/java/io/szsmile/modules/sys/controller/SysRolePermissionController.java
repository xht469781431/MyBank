package io.szsmile.modules.sys.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.szsmile.modules.sys.entity.SysRolePermissionEntity;
import io.szsmile.modules.sys.service.SysRolePermissionService;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.R;



/**
 * 系统用户角色权限表
 *
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:42
 */
@RestController
@RequestMapping("sys/sysrolepermission")
public class SysRolePermissionController {
    @Autowired
    private SysRolePermissionService sysRolePermissionService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:sysrolepermission:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = sysRolePermissionService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{roleId}")
    @RequiresPermissions("sys:sysrolepermission:info")
    public R info(@PathVariable("roleId") Integer roleId){
		SysRolePermissionEntity sysRolePermission = sysRolePermissionService.getById(roleId);

        return R.ok().put("sysRolePermission", sysRolePermission);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:sysrolepermission:save")
    public R save(@RequestBody SysRolePermissionEntity sysRolePermission){
		sysRolePermissionService.save(sysRolePermission);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:sysrolepermission:update")
    public R update(@RequestBody SysRolePermissionEntity sysRolePermission){
		sysRolePermissionService.updateById(sysRolePermission);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:sysrolepermission:delete")
    public R delete(@RequestBody Integer[] roleIds){
		sysRolePermissionService.removeByIds(Arrays.asList(roleIds));

        return R.ok();
    }

}
