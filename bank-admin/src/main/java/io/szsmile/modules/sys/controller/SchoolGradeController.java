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

import io.szsmile.modules.sys.entity.SchoolGradeEntity;
import io.szsmile.modules.sys.service.SchoolGradeService;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.R;



/**
 * 年级表
 *
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:35
 */
@RestController
@RequestMapping("sys/schoolgrade")
public class SchoolGradeController {
    @Autowired
    private SchoolGradeService schoolGradeService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:schoolgrade:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = schoolGradeService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:schoolgrade:info")
    public R info(@PathVariable("id") Integer id){
		SchoolGradeEntity schoolGrade = schoolGradeService.getById(id);

        return R.ok().put("schoolGrade", schoolGrade);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:schoolgrade:save")
    public R save(@RequestBody SchoolGradeEntity schoolGrade){
		schoolGradeService.save(schoolGrade);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:schoolgrade:update")
    public R update(@RequestBody SchoolGradeEntity schoolGrade){
		schoolGradeService.updateById(schoolGrade);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:schoolgrade:delete")
    public R delete(@RequestBody Integer[] ids){
		schoolGradeService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
