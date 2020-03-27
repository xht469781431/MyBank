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

import io.szsmile.modules.sys.entity.DistrictEntity;
import io.szsmile.modules.sys.service.DistrictService;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.R;



/**
 * 行政区
 *
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:42
 */
@RestController
@RequestMapping("sys/district")
public class DistrictController {
    @Autowired
    private DistrictService districtService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:district:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = districtService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:district:info")
    public R info(@PathVariable("id") Integer id){
		DistrictEntity district = districtService.getById(id);

        return R.ok().put("district", district);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:district:save")
    public R save(@RequestBody DistrictEntity district){
		districtService.save(district);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:district:update")
    public R update(@RequestBody DistrictEntity district){
		districtService.updateById(district);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:district:delete")
    public R delete(@RequestBody Integer[] ids){
		districtService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
