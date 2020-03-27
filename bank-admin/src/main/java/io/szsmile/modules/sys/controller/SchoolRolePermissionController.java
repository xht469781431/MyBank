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

import io.szsmile.modules.sys.entity.SchoolRolePermissionEntity;
import io.szsmile.modules.sys.service.SchoolRolePermissionService;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.R;



/**
 * 学校用户角色权限表
 *
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:42
 */
@RestController
@RequestMapping("sys/schoolrolepermission")
public class SchoolRolePermissionController {
    @Autowired
    private SchoolRolePermissionService schoolRolePermissionService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:schoolrolepermission:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = schoolRolePermissionService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{roleId}")
    @RequiresPermissions("sys:schoolrolepermission:info")
    public R info(@PathVariable("roleId") Integer roleId){
		SchoolRolePermissionEntity schoolRolePermission = schoolRolePermissionService.getById(roleId);

        return R.ok().put("schoolRolePermission", schoolRolePermission);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:schoolrolepermission:save")
    public R save(@RequestBody SchoolRolePermissionEntity schoolRolePermission){
		schoolRolePermissionService.save(schoolRolePermission);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:schoolrolepermission:update")
    public R update(@RequestBody SchoolRolePermissionEntity schoolRolePermission){
		schoolRolePermissionService.updateById(schoolRolePermission);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:schoolrolepermission:delete")
    public R delete(@RequestBody Integer[] roleIds){
		schoolRolePermissionService.removeByIds(Arrays.asList(roleIds));

        return R.ok();
    }

}
