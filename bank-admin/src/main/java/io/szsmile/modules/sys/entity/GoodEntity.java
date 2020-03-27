package io.szsmile.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import com.ll.*;

import javax.smartcardio.CardTerminal;

/**
 * 商品表
 * 
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:34
 */
@Data
@TableName("cb_good")
public class GoodEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 商品Id
	 */
	@TableId
	private Integer id;
	/**
	 * 商品分类Id
	 */
	private Integer categoryId;
	/**
	 * 商品名
	 */
	private String name;
	/**
	 * 价格
	 */
	private BigDecimal price;
	/**
	 * 状态 0:下架   1:正常
	 */
	private Integer status;

}
