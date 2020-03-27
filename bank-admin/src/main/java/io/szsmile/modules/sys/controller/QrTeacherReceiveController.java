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

import io.szsmile.modules.sys.entity.QrTeacherReceiveEntity;
import io.szsmile.modules.sys.service.QrTeacherReceiveService;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.R;



/**
 * 教师二维码领用表
 *
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:35
 */
@RestController
@RequestMapping("sys/qrteacherreceive")
public class QrTeacherReceiveController {
    @Autowired
    private QrTeacherReceiveService qrTeacherReceiveService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:qrteacherreceive:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = qrTeacherReceiveService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sys:qrteacherreceive:info")
    public R info(@PathVariable("id") Integer id){
		QrTeacherReceiveEntity qrTeacherReceive = qrTeacherReceiveService.getById(id);

        return R.ok().put("qrTeacherReceive", qrTeacherReceive);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:qrteacherreceive:save")
    public R save(@RequestBody QrTeacherReceiveEntity qrTeacherReceive){
		qrTeacherReceiveService.save(qrTeacherReceive);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:qrteacherreceive:update")
    public R update(@RequestBody QrTeacherReceiveEntity qrTeacherReceive){
		qrTeacherReceiveService.updateById(qrTeacherReceive);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:qrteacherreceive:delete")
    public R delete(@RequestBody Integer[] ids){
		qrTeacherReceiveService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
