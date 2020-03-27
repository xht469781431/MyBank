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

import io.szsmile.modules.sys.entity.SubjectEntity;
import io.szsmile.modules.sys.service.SubjectService;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.R;



/**
 * 学科表
 *
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:35
 */
@RestController
@RequestMapping("sys/subject")
public class SubjectController {
    @Autowired
    private SubjectService subjectService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:subject:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = subjectService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:subject:info")
    public R info(@PathVariable("id") Integer id){
		SubjectEntity subject = subjectService.getById(id);

        return R.ok().put("subject", subject);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:subject:save")
    public R save(@RequestBody SubjectEntity subject){
		subjectService.save(subject);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:subject:update")
    public R update(@RequestBody SubjectEntity subject){
		subjectService.updateById(subject);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:subject:delete")
    public R delete(@RequestBody Integer[] ids){
		subjectService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
