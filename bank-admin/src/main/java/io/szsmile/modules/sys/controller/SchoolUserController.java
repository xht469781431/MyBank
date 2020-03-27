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

import io.szsmile.modules.sys.entity.SchoolUserEntity;
import io.szsmile.modules.sys.service.SchoolUserService;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.R;



/**
 * 学校后管用户表
 *
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:42
 */
@RestController
@RequestMapping("sys/schooluser")
public class SchoolUserController {
    @Autowired
    private SchoolUserService schoolUserService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:schooluser:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = schoolUserService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:schooluser:info")
    public R info(@PathVariable("id") Integer id){
		SchoolUserEntity schoolUser = schoolUserService.getById(id);

        return R.ok().put("schoolUser", schoolUser);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:schooluser:save")
    public R save(@RequestBody SchoolUserEntity schoolUser){
		schoolUserService.save(schoolUser);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:schooluser:update")
    public R update(@RequestBody SchoolUserEntity schoolUser){
		schoolUserService.updateById(schoolUser);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:schooluser:delete")
    public R delete(@RequestBody Integer[] ids){
		schoolUserService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
