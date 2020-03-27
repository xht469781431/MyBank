package io.szsmile.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 学生家长表
 * 
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:35
 */
@Data
@TableName("cb_parent")
public class ParentEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * Id
	 */
	@TableId
	private Integer id;
	/**
	 * 微信小程序绑定的openId
	 */
	private String minappOpenId;
	/**
	 * 头像
	 */
	private String photoUrl;
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 联系电话
	 */
	private String telephone;
	/**
	 * 创建时间
	 */
	private Date created;

}
