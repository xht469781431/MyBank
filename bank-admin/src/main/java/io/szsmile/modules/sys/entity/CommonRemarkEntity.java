package io.szsmile.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 通用评语表
 * 
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:35
 */
@Data
@TableName("cb_common_remark")
public class CommonRemarkEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 评语Id
	 */
	@TableId
	private Integer id;
	/**
	 * 学校Id
	 */
	private Integer schoolId;
	/**
	 * 学科Id
	 */
	private Integer subjectId;
	/**
	 * 最低小红花数
	 */
	private Integer minQrStars;
	/**
	 * 评语内容
	 */
	private String remark;

}
