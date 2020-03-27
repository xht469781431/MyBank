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

import io.szsmile.modules.sys.entity.ReplaceNfcLineEntity;
import io.szsmile.modules.sys.service.ReplaceNfcLineService;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.R;



/**
 * 换折流水表
 *
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:26
 */
@RestController
@RequestMapping("sys/replacenfcline")
public class ReplaceNfcLineController {
    @Autowired
    private ReplaceNfcLineService replaceNfcLineService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:replacenfcline:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = replaceNfcLineService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:replacenfcline:info")
    public R info(@PathVariable("id") Integer id){
		ReplaceNfcLineEntity replaceNfcLine = replaceNfcLineService.getById(id);

        return R.ok().put("replaceNfcLine", replaceNfcLine);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:replacenfcline:save")
    public R save(@RequestBody ReplaceNfcLineEntity replaceNfcLine){
		replaceNfcLineService.save(replaceNfcLine);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:replacenfcline:update")
    public R update(@RequestBody ReplaceNfcLineEntity replaceNfcLine){
		replaceNfcLineService.updateById(replaceNfcLine);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:replacenfcline:delete")
    public R delete(@RequestBody Integer[] ids){
		replaceNfcLineService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
