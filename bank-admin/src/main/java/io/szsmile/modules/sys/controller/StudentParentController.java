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

import io.szsmile.modules.sys.entity.StudentParentEntity;
import io.szsmile.modules.sys.service.StudentParentService;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.R;



/**
 * 学生家长关系表
 *
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:26
 */
@RestController
@RequestMapping("sys/studentparent")
public class StudentParentController {
    @Autowired
    private StudentParentService studentParentService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:studentparent:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = studentParentService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{studentId}")
    @RequiresPermissions("sys:studentparent:info")
    public R info(@PathVariable("studentId") Integer studentId){
		StudentParentEntity studentParent = studentParentService.getById(studentId);

        return R.ok().put("studentParent", studentParent);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:studentparent:save")
    public R save(@RequestBody StudentParentEntity studentParent){
		studentParentService.save(studentParent);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:studentparent:update")
    public R update(@RequestBody StudentParentEntity studentParent){
		studentParentService.updateById(studentParent);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:studentparent:delete")
    public R delete(@RequestBody Integer[] studentIds){
		studentParentService.removeByIds(Arrays.asList(studentIds));

        return R.ok();
    }

}
