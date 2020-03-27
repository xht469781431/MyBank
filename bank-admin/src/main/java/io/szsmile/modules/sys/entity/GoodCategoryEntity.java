package io.szsmile.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品分类表
 * 
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:26
 */
@Data
@TableName("cb_good_category")
public class GoodCategoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 商品分类Id
	 */
	@TableId
	private Integer id;
	/**
	 * 学校Id
	 */
	private Integer schoolId;
	/**
	 * 上级分类Id，NULL表示根分类
	 */
	private Integer parentId;
	/**
	 * 名称
	 */
	private String name;

}
