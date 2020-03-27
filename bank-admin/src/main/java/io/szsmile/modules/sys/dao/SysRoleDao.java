package io.szsmile.modules.sys.dao;

import io.szsmile.modules.sys.entity.SysRoleEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统用户角色表
 * 
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:42
 */
@Mapper
public interface SysRoleDao extends BaseMapper<SysRoleEntity> {
	
}
