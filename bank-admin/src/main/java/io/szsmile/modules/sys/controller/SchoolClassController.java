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

import io.szsmile.modules.sys.entity.SchoolClassEntity;
import io.szsmile.modules.sys.service.SchoolClassService;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.R;



/**
 * 班级表
 *
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:35
 */
@RestController
@RequestMapping("sys/schoolclass")
public class SchoolClassController {
    @Autowired
    private SchoolClassService schoolClassService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:schoolclass:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = schoolClassService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:schoolclass:info")
    public R info(@PathVariable("id") Integer id){
		SchoolClassEntity schoolClass = schoolClassService.getById(id);

        return R.ok().put("schoolClass", schoolClass);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:schoolclass:save")
    public R save(@RequestBody SchoolClassEntity schoolClass){
		schoolClassService.save(schoolClass);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:schoolclass:update")
    public R update(@RequestBody SchoolClassEntity schoolClass){
		schoolClassService.updateById(schoolClass);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:schoolclass:delete")
    public R delete(@RequestBody Integer[] ids){
		schoolClassService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
