package io.szsmile.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品库存变动流水表
 * 
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:10
 */
@Data
@TableName("cb_stock_line")
public class StockLineEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 流水Id
	 */
	@TableId
	private Integer id;
	/**
	 * 学校Id
	 */
	private Integer schoolId;
	/**
	 * 商品Id
	 */
	private Integer goodId;
	/**
	 * 销售数量
	 */
	private Integer saleQuantity;
	/**
	 * 入库数量
	 */
	private Integer inQuantity;
	/**
	 * 其它数量，盘亏为负数
	 */
	private Integer otherQuantity;
	/**
	 * 期末库存
	 */
	private Integer balance;
	/**
	 * 操作员Id
	 */
	private Integer operatorId;
	/**
	 * 创建时间
	 */
	private Date created;

}
