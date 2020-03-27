package io.szsmile.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 系统用户权限表
 * 
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:42
 */
@Data
@TableName("cb_sys_permission")
public class SysPermissionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 权限Id
	 */
	@TableId
	private Integer id;
	/**
	 * 父权限Id，NULL表示根权限
	 */
	private Integer parentId;
	/**
	 * 权限名
	 */
	private String name;
	/**
	 * 权限说明
	 */
	private String explanation;

}
