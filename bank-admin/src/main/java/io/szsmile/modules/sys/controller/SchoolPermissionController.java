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

import io.szsmile.modules.sys.entity.SchoolPermissionEntity;
import io.szsmile.modules.sys.service.SchoolPermissionService;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.R;



/**
 * 学校用户权限表
 *
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:10
 */
@RestController
@RequestMapping("sys/schoolpermission")
public class SchoolPermissionController {
    @Autowired
    private SchoolPermissionService schoolPermissionService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:schoolpermission:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = schoolPermissionService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:schoolpermission:info")
    public R info(@PathVariable("id") Integer id){
		SchoolPermissionEntity schoolPermission = schoolPermissionService.getById(id);

        return R.ok().put("schoolPermission", schoolPermission);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:schoolpermission:save")
    public R save(@RequestBody SchoolPermissionEntity schoolPermission){
		schoolPermissionService.save(schoolPermission);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:schoolpermission:update")
    public R update(@RequestBody SchoolPermissionEntity schoolPermission){
		schoolPermissionService.updateById(schoolPermission);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:schoolpermission:delete")
    public R delete(@RequestBody Integer[] ids){
		schoolPermissionService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
