package io.szsmile.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 亲属关系表
 * 
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:42
 */
@Data
@TableName("cb_relative")
public class RelativeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * Id
	 */
	@TableId
	private Integer id;
	/**
	 * 与孩子关系
	 */
	private String name;

}
