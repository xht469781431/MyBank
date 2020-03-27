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

import io.szsmile.modules.sys.entity.QrDetailEntity;
import io.szsmile.modules.sys.service.QrDetailService;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.R;



/**
 * 二维码明细表
 *
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:26
 */
@RestController
@RequestMapping("sys/qrdetail")
public class QrDetailController {
    @Autowired
    private QrDetailService qrDetailService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:qrdetail:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = qrDetailService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{schoolId}")
    @RequiresPermissions("sys:qrdetail:info")
    public R info(@PathVariable("schoolId") Integer schoolId){
		QrDetailEntity qrDetail = qrDetailService.getById(schoolId);

        return R.ok().put("qrDetail", qrDetail);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:qrdetail:save")
    public R save(@RequestBody QrDetailEntity qrDetail){
		qrDetailService.save(qrDetail);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:qrdetail:update")
    public R update(@RequestBody QrDetailEntity qrDetail){
		qrDetailService.updateById(qrDetail);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:qrdetail:delete")
    public R delete(@RequestBody Integer[] schoolIds){
		qrDetailService.removeByIds(Arrays.asList(schoolIds));

        return R.ok();
    }

}
