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

import io.szsmile.modules.sys.entity.SysLogEntity;
import io.szsmile.modules.sys.service.SysLogService;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.R;



/**
 * 系统操作日志表
 *
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:10
 */
@RestController
@RequestMapping("sys/syslog")
public class SysLogController {
    @Autowired
    private SysLogService sysLogService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:syslog:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = sysLogService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:syslog:info")
    public R info(@PathVariable("id") Integer id){
		SysLogEntity sysLog = sysLogService.getById(id);

        return R.ok().put("sysLog", sysLog);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:syslog:save")
    public R save(@RequestBody SysLogEntity sysLog){
		sysLogService.save(sysLog);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:syslog:update")
    public R update(@RequestBody SysLogEntity sysLog){
		sysLogService.updateById(sysLog);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:syslog:delete")
    public R delete(@RequestBody Integer[] ids){
		sysLogService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
