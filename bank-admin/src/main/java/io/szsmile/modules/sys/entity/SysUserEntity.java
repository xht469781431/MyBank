package io.szsmile.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import io.szsmile.common.validator.group.AddGroup;
import io.szsmile.common.validator.group.UpdateGroup;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

/**
 * 系统后管用户表
 * 
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:42
 */
@Data
@TableName("cb_sys_user")
public class SysUserEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 用户Id
	 */
	@TableId
	private Integer id;
	/**
	 * 用户名
	 */
    @NotBlank(message="用户名不能为空", groups = {AddGroup.class, UpdateGroup.class})
	private String username;
	/**
	 * 密码
	 */
    @NotBlank(message="密码不能为空", groups = AddGroup.class)
	private String password;

    /**
     * 盐
     */
    private String salt;

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
    @NotBlank(message="邮箱不能为空", groups = {AddGroup.class, UpdateGroup.class})
    @Email(message="邮箱格式不正确", groups = {AddGroup.class, UpdateGroup.class})
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
	 * 创建时间
	 */
	private Date created;
	/**
	 * 修改时间
	 */
	private Date modified;

}
