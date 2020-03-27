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

import io.szsmile.modules.sys.entity.SchoolShopUserEntity;
import io.szsmile.modules.sys.service.SchoolShopUserService;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.R;



/**
 * 商场操作员表
 *
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:35
 */
@RestController
@RequestMapping("sys/schoolshopuser")
public class SchoolShopUserController {
    @Autowired
    private SchoolShopUserService schoolShopUserService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:schoolshopuser:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = schoolShopUserService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{studentId}")
    @RequiresPermissions("sys:schoolshopuser:info")
    public R info(@PathVariable("studentId") Integer studentId){
		SchoolShopUserEntity schoolShopUser = schoolShopUserService.getById(studentId);

        return R.ok().put("schoolShopUser", schoolShopUser);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:schoolshopuser:save")
    public R save(@RequestBody SchoolShopUserEntity schoolShopUser){
		schoolShopUserService.save(schoolShopUser);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:schoolshopuser:update")
    public R update(@RequestBody SchoolShopUserEntity schoolShopUser){
		schoolShopUserService.updateById(schoolShopUser);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:schoolshopuser:delete")
    public R delete(@RequestBody Integer[] studentIds){
		schoolShopUserService.removeByIds(Arrays.asList(studentIds));

        return R.ok();
    }

}
