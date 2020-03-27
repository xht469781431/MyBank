package io.szsmile.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 行政区
 * 
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:42
 */
@Data
@TableName("cb_district")
public class DistrictEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 行政区Id
	 */
	@TableId
	private Integer id;
	/**
	 * 行政区名称
	 */
	private String name;

}
