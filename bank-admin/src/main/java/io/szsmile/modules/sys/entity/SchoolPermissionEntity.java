package io.szsmile.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import lombok.Data;

/**
 * 学校用户权限表
 * 
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:10
 */
@Data
@TableName("cb_school_permission")
public class SchoolPermissionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 权限Id
	 */
	@TableId
	private Integer id;
	/**
	 * 父权限Id
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
