package io.szsmile.modules.sys.dao;

import io.szsmile.modules.sys.entity.SysUserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统后管用户表
 * 
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:42
 */
@Mapper
public interface SysUserDao extends BaseMapper<SysUserEntity> {
	
}
