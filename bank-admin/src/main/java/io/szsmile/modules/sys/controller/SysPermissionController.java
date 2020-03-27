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

import io.szsmile.modules.sys.entity.SysPermissionEntity;
import io.szsmile.modules.sys.service.SysPermissionService;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.R;



/**
 * 系统用户权限表
 *
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:42
 */
@RestController
@RequestMapping("sys/syspermission")
public class SysPermissionController {
    @Autowired
    private SysPermissionService sysPermissionService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:syspermission:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = sysPermissionService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:syspermission:info")
    public R info(@PathVariable("id") Integer id){
		SysPermissionEntity sysPermission = sysPermissionService.getById(id);

        return R.ok().put("sysPermission", sysPermission);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:syspermission:save")
    public R save(@RequestBody SysPermissionEntity sysPermission){
		sysPermissionService.save(sysPermission);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:syspermission:update")
    public R update(@RequestBody SysPermissionEntity sysPermission){
		sysPermissionService.updateById(sysPermission);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:syspermission:delete")
    public R delete(@RequestBody Integer[] ids){
		sysPermissionService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
