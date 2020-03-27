package io.szsmile.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 学校操作日志表
 * 
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:10
 */
@Data
@TableName("cb_school_log")
public class SchoolLogEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 流水Id
	 */
	@TableId
	private Integer id;
	/**
	 * 学校Id
	 */
	private Integer schoolId;
	/**
	 * 用户Id
	 */
	private Integer userId;
	/**
	 * 用户名
	 */
	private String username;
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 操作主题
	 */
	private String title;
	/**
	 * 操作明细
	 */
	private String detail;
	/**
	 * 1:后管 2:柜台 3:商城
	 */
	private Integer type;
	/**
	 * 创建时间
	 */
	private Date created;

}
