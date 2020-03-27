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

import io.szsmile.modules.sys.entity.CommonRemarkEntity;
import io.szsmile.modules.sys.service.CommonRemarkService;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.R;

/**
 * 通用评语表
 *
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:35
 */
@RestController
@RequestMapping("sys/commonremark")
public class CommonRemarkController {
    @Autowired
    private CommonRemarkService commonRemarkService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:commonremark:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = commonRemarkService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:commonremark:info")
    public R info(@PathVariable("id") Integer id){
		CommonRemarkEntity commonRemark = commonRemarkService.getById(id);

        return R.ok().put("commonRemark", commonRemark);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:commonremark:save")
    public R save(@RequestBody CommonRemarkEntity commonRemark){
		commonRemarkService.save(commonRemark);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:commonremark:update")
    public R update(@RequestBody CommonRemarkEntity commonRemark){
		commonRemarkService.updateById(commonRemark);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:commonremark:delete")
    public R delete(@RequestBody Integer[] ids){
		commonRemarkService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
