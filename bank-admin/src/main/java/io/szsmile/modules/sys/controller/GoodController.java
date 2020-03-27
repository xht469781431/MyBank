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

import io.szsmile.modules.sys.entity.GoodEntity;
import io.szsmile.modules.sys.service.GoodService;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.R;



/**
 * 商品表
 *
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:34
 */
@RestController
@RequestMapping("sys/good")
public class GoodController {
    @Autowired
    private GoodService goodService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:good:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = goodService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:good:info")
    public R info(@PathVariable("id") Integer id){
		GoodEntity good = goodService.getById(id);

        return R.ok().put("good", good);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:good:save")
    public R save(@RequestBody GoodEntity good){
		goodService.save(good);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:good:update")
    public R update(@RequestBody GoodEntity good){
		goodService.updateById(good);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:good:delete")
    public R delete(@RequestBody Integer[] ids){
		goodService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
