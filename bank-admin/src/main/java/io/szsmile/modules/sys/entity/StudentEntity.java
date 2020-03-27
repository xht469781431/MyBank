package io.szsmile.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 学生表
 * 
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:35
 */
@Data
@TableName("cb_student")
public class StudentEntity implements Serializable {
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
	 * 班级Id
	 */
	private Integer classId;
	/**
	 * 学号
	 */
	private String sno;
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 性别 1:男 2:女
	 */
	private Integer sex;
	/**
	 * 家长电话
	 */
	private String parentTelephone;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 照片
	 */
	private String photo;
	/**
	 * 状态 1:正常  2:转学  3:毕业
	 */
	private Integer status;
	/**
	 * 存折编号
	 */
	private String nfcNumber;
	/**
	 * 存折余额
	 */
	private BigDecimal balance;
	/**
	 * 创建时间
	 */
	private Date created;
	/**
	 * 创建时间
	 */
	private Date modified;

}
