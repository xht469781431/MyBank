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

import io.szsmile.modules.sys.entity.RelativeEntity;
import io.szsmile.modules.sys.service.RelativeService;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.R;



/**
 * 亲属关系表
 *
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:42
 */
@RestController
@RequestMapping("sys/relative")
public class RelativeController {
    @Autowired
    private RelativeService relativeService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:relative:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = relativeService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:relative:info")
    public R info(@PathVariable("id") Integer id){
		RelativeEntity relative = relativeService.getById(id);

        return R.ok().put("relative", relative);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:relative:save")
    public R save(@RequestBody RelativeEntity relative){
		relativeService.save(relative);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:relative:update")
    public R update(@RequestBody RelativeEntity relative){
		relativeService.updateById(relative);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:relative:delete")
    public R delete(@RequestBody Integer[] ids){
		relativeService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
