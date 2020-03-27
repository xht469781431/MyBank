package io.szsmile.modules.sys.dao;

import io.szsmile.modules.sys.entity.SysLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统操作日志表
 * 
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:10
 */
@Mapper
public interface SysLogDao extends BaseMapper<SysLogEntity> {
	
}
