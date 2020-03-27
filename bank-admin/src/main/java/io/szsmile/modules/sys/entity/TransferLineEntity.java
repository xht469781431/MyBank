package io.szsmile.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 转账流水表
 * 
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:26
 */
@Data
@TableName("cb_transfer_line")
public class TransferLineEntity implements Serializable {
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
	 * 转出学生Id
	 */
	private Integer studentId;
	/**
	 * 转出存折编号
	 */
	private String nfcNumber;
	/**
	 * 设备类型 1:ATM 2:柜台 3:小程序
	 */
	private Integer deviceType;
	/**
	 * 设备Id
	 */
	private String deviceId;
	/**
	 * 转入学生Id
	 */
	private Integer toStudentId;
	/**
	 * 转入存折编号
	 */
	private String toNfcNumber;
	/**
	 * 金额
	 */
	private BigDecimal amount;
	/**
	 * 操作员Id
	 */
	private Integer operatorId;
	/**
	 * 创建时间
	 */
	private Date created;

}
