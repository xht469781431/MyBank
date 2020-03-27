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

import io.szsmile.modules.sys.entity.OrderDetailEntity;
import io.szsmile.modules.sys.service.OrderDetailService;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.common.utils.R;



/**
 * 商品销售明细表
 *
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:26
 */
@RestController
@RequestMapping("sys/orderdetail")
public class OrderDetailController {
    @Autowired
    private OrderDetailService orderDetailService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sys:orderdetail:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = orderDetailService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{orderId}")
    @RequiresPermissions("sys:orderdetail:info")
    public R info(@PathVariable("orderId") Integer orderId){
		OrderDetailEntity orderDetail = orderDetailService.getById(orderId);

        return R.ok().put("orderDetail", orderDetail);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sys:orderdetail:save")
    public R save(@RequestBody OrderDetailEntity orderDetail){
		orderDetailService.save(orderDetail);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sys:orderdetail:update")
    public R update(@RequestBody OrderDetailEntity orderDetail){
		orderDetailService.updateById(orderDetail);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sys:orderdetail:delete")
    public R delete(@RequestBody Integer[] orderIds){
		orderDetailService.removeByIds(Arrays.asList(orderIds));

        return R.ok();
    }

}
