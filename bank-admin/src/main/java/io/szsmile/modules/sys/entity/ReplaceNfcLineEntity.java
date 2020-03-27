package io.szsmile.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 换折流水表
 * 
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:26
 */
@Data
@TableName("cb_replace_nfc_line")
public class ReplaceNfcLineEntity implements Serializable {
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
	 * 学生Id
	 */
	private Integer studentId;
	/**
	 * 原存折编号
	 */
	private String oldNfcNumber;
	/**
	 * 新存折编号
	 */
	private String newNfcNumber;
	/**
	 * 余额
	 */
	private BigDecimal balance;
	/**
	 * 操作员Id
	 */
	private Integer operatorId;
	/**
	 * 创建时间
	 */
	private Date created;

}
