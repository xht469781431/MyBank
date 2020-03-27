package io.szsmile.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 教师二维码领用表
 * 
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:35
 */
@Data
@TableName("cb_qr_teacher_receive")
public class QrTeacherReceiveEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * Id
	 */
	@TableId
	private Integer id;
	/**
	 * 老师Id
	 */
	private Integer teacherId;
	/**
	 * 学科Id
	 */
	private Integer subjectId;
	/**
	 * 方式 0:领用  1:回收
	 */
	private Integer mode;
	/**
	 * 二维码起始编号
	 */
	private Integer startNo;
	/**
	 * 二维码截止编号
	 */
	private Integer endNo;
	/**
	 * 创建时间
	 */
	private Date created;

}
