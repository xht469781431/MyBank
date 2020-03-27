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

import io.szsmile.modules.sys.entity.SchoolLogEntity;
import io.szsmile.modules.sys.service.SchoolLogService;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.R;



/**
 * 学校操作日志表
 *
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:10
 */
@RestController
@RequestMapping("sys/schoollog")
public class SchoolLogController {
    @Autowired
    private SchoolLogService schoolLogService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:schoollog:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = schoolLogService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:schoollog:info")
    public R info(@PathVariable("id") Integer id){
		SchoolLogEntity schoolLog = schoolLogService.getById(id);

        return R.ok().put("schoolLog", schoolLog);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:schoollog:save")
    public R save(@RequestBody SchoolLogEntity schoolLog){
		schoolLogService.save(schoolLog);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:schoollog:update")
    public R update(@RequestBody SchoolLogEntity schoolLog){
		schoolLogService.updateById(schoolLog);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:schoollog:delete")
    public R delete(@RequestBody Integer[] ids){
		schoolLogService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
