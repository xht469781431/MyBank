package io.szsmile.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 二维码明细表
 * 
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:26
 */
@Data
@TableName("cb_qr_detail")
public class QrDetailEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 学校Id
	 */
	@TableId
	private Integer schoolId;
	/**
	 * 二维码序号
	 */
	private Integer no;
	/**
	 * 二维码编号
	 */
	private String qrCode;
	/**
	 * 状态 0:未领用  1:已领用  2:已兑换
	 */
	private Integer status;
	/**
	 * 领用的老师Id
	 */
	private Integer teacherId;
	/**
	 * 领用的学科Id
	 */
	private Integer subjectId;
	/**
	 * 存入的学生Id
	 */
	private Integer studentId;
	/**
	 * 存入的流水表Id
	 */
	private Integer qrLine;

}
