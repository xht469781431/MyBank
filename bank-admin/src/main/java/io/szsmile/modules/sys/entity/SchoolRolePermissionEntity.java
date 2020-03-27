package io.szsmile.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 学校用户角色权限表
 * 
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:42
 */
@Data
@TableName("cb_school_role_permission")
public class SchoolRolePermissionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 角色Id
	 */
	@TableId
	private Integer roleId;
	/**
	 * 权限Id
	 */
	private Integer permissionId;

}
