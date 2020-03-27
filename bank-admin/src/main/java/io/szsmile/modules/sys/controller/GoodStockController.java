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

import io.szsmile.modules.sys.entity.GoodStockEntity;
import io.szsmile.modules.sys.service.GoodStockService;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.R;



/**
 * 商品库存
 *
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:26
 */
@RestController
@RequestMapping("sys/goodstock")
public class GoodStockController {
    @Autowired
    private GoodStockService goodStockService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:goodstock:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = goodStockService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{goodId}")
    @RequiresPermissions("sys:goodstock:info")
    public R info(@PathVariable("goodId") Integer goodId){
		GoodStockEntity goodStock = goodStockService.getById(goodId);

        return R.ok().put("goodStock", goodStock);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:goodstock:save")
    public R save(@RequestBody GoodStockEntity goodStock){
		goodStockService.save(goodStock);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:goodstock:update")
    public R update(@RequestBody GoodStockEntity goodStock){
		goodStockService.updateById(goodStock);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:goodstock:delete")
    public R delete(@RequestBody Integer[] goodIds){
		goodStockService.removeByIds(Arrays.asList(goodIds));

        return R.ok();
    }

}
