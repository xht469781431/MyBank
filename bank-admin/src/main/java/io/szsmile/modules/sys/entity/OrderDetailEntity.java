package io.szsmile.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品销售明细表
 * 
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:26
 */
@Data
@TableName("cb_order_detail")
public class OrderDetailEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 流水Id
	 */
	@TableId
	private Integer orderId;
	/**
	 * 序号
	 */
	private Integer no;
	/**
	 * 商品Id
	 */
	private Integer goodId;
	/**
	 * 商品单价
	 */
	private BigDecimal price;
	/**
	 * 购买数量
	 */
	private Integer quantity;
	/**
	 * 金额
	 */
	private BigDecimal amount;

}
