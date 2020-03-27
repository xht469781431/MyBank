package io.szsmile.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 教师表
 * 
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:26
 */
@Data
@TableName("cb_teacher")
public class TeacherEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * Id
	 */
	@TableId
	private Integer id;
	/**
	 * 学校Id
	 */
	private Integer schoolId;
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
	 * 照片
	 */
	private String photo;
	/**
	 * 创建时间
	 */
	private Date created;
	/**
	 * 创建时间
	 */
	private Date modified;

}
