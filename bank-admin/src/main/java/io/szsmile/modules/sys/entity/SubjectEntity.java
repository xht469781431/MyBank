package io.szsmile.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 学科表
 * 
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:35
 */
@Data
@TableName("cb_subject")
public class SubjectEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 学科Id
	 */
	@TableId
	private Integer id;
	/**
	 * 学校Id
	 */
	private Integer schoolId;
	/**
	 * 学科名称
	 */
	private String name;
	/**
	 * 学科logo 2x分辨率
	 */
	private String logo2x;
	/**
	 * 学科logo 3x分辨率
	 */
	private String logo3x;
	/**
	 * 创建时间
	 */
	private Date created;
	/**
	 * 创建时间
	 */
	private Date modified;

}
