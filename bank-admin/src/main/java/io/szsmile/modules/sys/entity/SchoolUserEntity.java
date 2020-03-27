package io.szsmile.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 学校后管用户表
 * 
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:42
 */
@Data
@TableName("cb_school_user")
public class SchoolUserEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 用户Id
	 */
	@TableId
	private Integer id;
	/**
	 * 学校Id
	 */
	private Integer schoolId;
	/**
	 * 用户名
	 */
	private String username;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 性别 1:男 2:女
	 */
	private Integer sex;
	/**
	 * 地址
	 */
	private String workAddress;
	/**
	 * 联系电话
	 */
	private String telephone;
	/**
	 * 邮箱
	 */
	private String emailaddress;
	/**
	 * 角色
	 */
	private Integer roleId;
	/**
	 * 状态 0:正常 1:停用
	 */
	private Integer status;
	/**
	 * 是否是由系统管理员创建 1:是
	 */
	private Integer createdBySys;
	/**
	 * 创建时间
	 */
	private Date created;
	/**
	 * 创建时间
	 */
	private Date modified;

}
