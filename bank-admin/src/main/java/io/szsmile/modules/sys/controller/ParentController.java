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

import io.szsmile.modules.sys.entity.ParentEntity;
import io.szsmile.modules.sys.service.ParentService;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.R;



/**
 * 学生家长表
 *
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:35
 */
@RestController
@RequestMapping("sys/parent")
public class ParentController {
    @Autowired
    private ParentService parentService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:parent:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = parentService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:parent:info")
    public R info(@PathVariable("id") Integer id){
		ParentEntity parent = parentService.getById(id);

        return R.ok().put("parent", parent);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:parent:save")
    public R save(@RequestBody ParentEntity parent){
		parentService.save(parent);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:parent:update")
    public R update(@RequestBody ParentEntity parent){
		parentService.updateById(parent);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:parent:delete")
    public R delete(@RequestBody Integer[] ids){
		parentService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
