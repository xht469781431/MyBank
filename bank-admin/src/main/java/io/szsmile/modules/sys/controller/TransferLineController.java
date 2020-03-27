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

import io.szsmile.modules.sys.entity.TransferLineEntity;
import io.szsmile.modules.sys.service.TransferLineService;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.R;



/**
 * 转账流水表
 *
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:26
 */
@RestController
@RequestMapping("sys/transferline")
public class TransferLineController {
    @Autowired
    private TransferLineService transferLineService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:transferline:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = transferLineService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:transferline:info")
    public R info(@PathVariable("id") Integer id){
		TransferLineEntity transferLine = transferLineService.getById(id);

        return R.ok().put("transferLine", transferLine);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:transferline:save")
    public R save(@RequestBody TransferLineEntity transferLine){
		transferLineService.save(transferLine);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:transferline:update")
    public R update(@RequestBody TransferLineEntity transferLine){
		transferLineService.updateById(transferLine);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:transferline:delete")
    public R delete(@RequestBody Integer[] ids){
		transferLineService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
