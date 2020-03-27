package io.szsmile.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 设备信息表
 * 
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:10
 */
@Data
@TableName("cb_sys_device")
public class SysDeviceEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 设备内部Id
	 */
	@TableId
	private Integer id;
	/**
	 * 设备编号
	 */
	private String code;
	/**
	 * 设备IMEI
	 */
	private String imei;
	/**
	 * 学校Id
	 */
	private Integer schoolId;
	/**
	 * 地点
	 */
	private String address;
	/**
	 * 状态 0.正常 1.维修 2.停用
	 */
	private Integer status;
	/**
	 * 创建时间
	 */
	private Date created;
	/**
	 * 修改时间
	 */
	private Date modified;

}
