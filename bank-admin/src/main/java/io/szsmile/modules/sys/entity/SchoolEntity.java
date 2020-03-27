package io.szsmile.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 学校表
 * 
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:42
 */
@Data
@TableName("cb_school")
public class SchoolEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 学校Id
	 */
	@TableId
	private Integer id;
	/**
	 * 学校名称
	 */
	private String name;
	/**
	 * 学校地址
	 */
	private String address;
	/**
	 * logo图,base64编码
	 */
	private String logo;
	/**
	 * 行政区Id
	 */
	private Integer districtId;
	/**
	 * 状态 0:正常  1:停用
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
