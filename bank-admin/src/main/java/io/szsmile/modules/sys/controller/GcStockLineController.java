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

import io.szsmile.modules.sys.entity.GcStockLineEntity;
import io.szsmile.modules.sys.service.GcStockLineService;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.R;



/**
 * 金币库存变动流水表
 *
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:10
 */
@RestController
@RequestMapping("sys/gcstockline")
public class GcStockLineController {
    @Autowired
    private GcStockLineService gcStockLineService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:gcstockline:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = gcStockLineService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:gcstockline:info")
    public R info(@PathVariable("id") Integer id){
		GcStockLineEntity gcStockLine = gcStockLineService.getById(id);

        return R.ok().put("gcStockLine", gcStockLine);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:gcstockline:save")
    public R save(@RequestBody GcStockLineEntity gcStockLine){
		gcStockLineService.save(gcStockLine);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:gcstockline:update")
    public R update(@RequestBody GcStockLineEntity gcStockLine){
		gcStockLineService.updateById(gcStockLine);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:gcstockline:delete")
    public R delete(@RequestBody Integer[] ids){
		gcStockLineService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
