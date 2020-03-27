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

import io.szsmile.modules.sys.entity.SchoolCounterUserEntity;
import io.szsmile.modules.sys.service.SchoolCounterUserService;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.R;



/**
 * 柜台操作员表
 *
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:26
 */
@RestController
@RequestMapping("sys/schoolcounteruser")
public class SchoolCounterUserController {
    @Autowired
    private SchoolCounterUserService schoolCounterUserService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:schoolcounteruser:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = schoolCounterUserService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{studentId}")
    @RequiresPermissions("sys:schoolcounteruser:info")
    public R info(@PathVariable("studentId") Integer studentId){
		SchoolCounterUserEntity schoolCounterUser = schoolCounterUserService.getById(studentId);

        return R.ok().put("schoolCounterUser", schoolCounterUser);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:schoolcounteruser:save")
    public R save(@RequestBody SchoolCounterUserEntity schoolCounterUser){
		schoolCounterUserService.save(schoolCounterUser);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:schoolcounteruser:update")
    public R update(@RequestBody SchoolCounterUserEntity schoolCounterUser){
		schoolCounterUserService.updateById(schoolCounterUser);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:schoolcounteruser:delete")
    public R delete(@RequestBody Integer[] studentIds){
		schoolCounterUserService.removeByIds(Arrays.asList(studentIds));

        return R.ok();
    }

}
