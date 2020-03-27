package io.szsmile.modules.sys.dao;

import io.szsmile.modules.sys.entity.SysDeviceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 设备信息表
 * 
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:10
 */
@Mapper
public interface SysDeviceDao extends BaseMapper<SysDeviceEntity> {
	
}
