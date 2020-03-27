package io.szsmile.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 年级表
 * 
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:35
 */
@Data
@TableName("cb_school_grade")
public class SchoolGradeEntity implements Serializable {
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
	 * 入学年份
	 */
	private Integer enterYear;
	/**
	 * 简称
	 */
	private String shortName;
	/**
	 * 状态 0:在校  1:离校
	 */
	private Integer status;
	/**
	 * 创建时间
	 */
	private Date created;
	/**
	 * 创建时间
	 */
	private Date modified;

}
