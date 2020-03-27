package io.szsmile.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 系统用户角色表
 * 
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:42
 */
@Data
@TableName("cb_sys_role")
public class SysRoleEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 角色Id
	 */
	@TableId
	private Integer id;
	/**
	 * 角色名
	 */
	private String name;
	/**
	 * 角色说明
	 */
	private String explanation;
	/**
	 * 创建时间
	 */
	private Date created;
	/**
	 * 创建时间
	 */
	private Date modified;

}
