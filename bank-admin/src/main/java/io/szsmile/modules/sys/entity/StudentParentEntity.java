package io.szsmile.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 学生家长关系表
 * 
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:26
 */
@Data
@TableName("cb_student_parent")
public class StudentParentEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 学生Id
	 */
	@TableId
	private Integer studentId;
	/**
	 * 家长Id
	 */
	private Integer parentId;
	/**
	 * 关系
	 */
	private Integer relativeId;

}
