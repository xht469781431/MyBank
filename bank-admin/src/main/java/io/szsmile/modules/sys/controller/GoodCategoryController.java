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

import io.szsmile.modules.sys.entity.GoodCategoryEntity;
import io.szsmile.modules.sys.service.GoodCategoryService;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.R;



/**
 * 商品分类表
 *
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:26
 */
@RestController
@RequestMapping("sys/goodcategory")
public class GoodCategoryController {
    @Autowired
    private GoodCategoryService goodCategoryService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:goodcategory:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = goodCategoryService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:goodcategory:info")
    public R info(@PathVariable("id") Integer id){
		GoodCategoryEntity goodCategory = goodCategoryService.getById(id);

        return R.ok().put("goodCategory", goodCategory);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:goodcategory:save")
    public R save(@RequestBody GoodCategoryEntity goodCategory){
		goodCategoryService.save(goodCategory);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:goodcategory:update")
    public R update(@RequestBody GoodCategoryEntity goodCategory){
		goodCategoryService.updateById(goodCategory);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:goodcategory:delete")
    public R delete(@RequestBody Integer[] ids){
		goodCategoryService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
