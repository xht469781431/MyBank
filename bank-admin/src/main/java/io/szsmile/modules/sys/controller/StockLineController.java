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

import io.szsmile.modules.sys.entity.StockLineEntity;
import io.szsmile.modules.sys.service.StockLineService;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.R;



/**
 * 商品库存变动流水表
 *
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:10
 */
@RestController
@RequestMapping("sys/stockline")
public class StockLineController {
    @Autowired
    private StockLineService stockLineService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:stockline:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = stockLineService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:stockline:info")
    public R info(@PathVariable("id") Integer id){
		StockLineEntity stockLine = stockLineService.getById(id);

        return R.ok().put("stockLine", stockLine);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:stockline:save")
    public R save(@RequestBody StockLineEntity stockLine){
		stockLineService.save(stockLine);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:stockline:update")
    public R update(@RequestBody StockLineEntity stockLine){
		stockLineService.updateById(stockLine);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:stockline:delete")
    public R delete(@RequestBody Integer[] ids){
		stockLineService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
