package io.szsmile.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商场操作员表
 * 
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:35
 */
@Data
@TableName("cb_school_shop_user")
public class SchoolShopUserEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 学生Id
	 */
	@TableId
	private Integer studentId;
	/**
	 * 操作员角色：1:主管  2:普通操作员
	 */
	private Integer role;
	/**
	 * 创建时间
	 */
	private Date created;
	/**
	 * 创建时间
	 */
	private Date modified;

}
