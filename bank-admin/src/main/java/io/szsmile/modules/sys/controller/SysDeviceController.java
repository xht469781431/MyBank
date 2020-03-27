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

import io.szsmile.modules.sys.entity.SysDeviceEntity;
import io.szsmile.modules.sys.service.SysDeviceService;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.R;



/**
 * 设备信息表
 *
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:10
 */
@RestController
@RequestMapping("sys/sysdevice")
public class SysDeviceController {
    @Autowired
    private SysDeviceService sysDeviceService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:sysdevice:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = sysDeviceService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:sysdevice:info")
    public R info(@PathVariable("id") Integer id){
		SysDeviceEntity sysDevice = sysDeviceService.getById(id);

        return R.ok().put("sysDevice", sysDevice);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:sysdevice:save")
    public R save(@RequestBody SysDeviceEntity sysDevice){
		sysDeviceService.save(sysDevice);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:sysdevice:update")
    public R update(@RequestBody SysDeviceEntity sysDevice){
		sysDeviceService.updateById(sysDevice);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:sysdevice:delete")
    public R delete(@RequestBody Integer[] ids){
		sysDeviceService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
