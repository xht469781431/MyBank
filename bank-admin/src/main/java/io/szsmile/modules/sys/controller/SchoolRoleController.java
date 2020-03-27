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

import io.szsmile.modules.sys.entity.SchoolRoleEntity;
import io.szsmile.modules.sys.service.SchoolRoleService;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.R;



/**
 * 学校用户角色表
 *
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:35
 */
@RestController
@RequestMapping("sys/schoolrole")
public class SchoolRoleController {
    @Autowired
    private SchoolRoleService schoolRoleService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:schoolrole:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = schoolRoleService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:schoolrole:info")
    public R info(@PathVariable("id") Integer id){
		SchoolRoleEntity schoolRole = schoolRoleService.getById(id);

        return R.ok().put("schoolRole", schoolRole);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:schoolrole:save")
    public R save(@RequestBody SchoolRoleEntity schoolRole){
		schoolRoleService.save(schoolRole);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:schoolrole:update")
    public R update(@RequestBody SchoolRoleEntity schoolRole){
		schoolRoleService.updateById(schoolRole);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:schoolrole:delete")
    public R delete(@RequestBody Integer[] ids){
		schoolRoleService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
