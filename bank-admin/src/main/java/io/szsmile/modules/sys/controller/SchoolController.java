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

import io.szsmile.modules.sys.entity.SchoolEntity;
import io.szsmile.modules.sys.service.SchoolService;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.R;



/**
 * 学校表
 *
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:42
 */
@RestController
@RequestMapping("sys/school")
public class SchoolController {
    @Autowired
    private SchoolService schoolService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:school:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = schoolService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:school:info")
    public R info(@PathVariable("id") Integer id){
		SchoolEntity school = schoolService.getById(id);

        return R.ok().put("school", school);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:school:save")
    public R save(@RequestBody SchoolEntity school){
		schoolService.save(school);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:school:update")
    public R update(@RequestBody SchoolEntity school){
		schoolService.updateById(school);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:school:delete")
    public R delete(@RequestBody Integer[] ids){
		schoolService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
