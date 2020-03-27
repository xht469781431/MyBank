package io.szsmile.modules.sys.dao;

import io.szsmile.modules.sys.entity.SchoolUserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 学校后管用户表
 * 
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:42
 */
@Mapper
public interface SchoolUserDao extends BaseMapper<SchoolUserEntity> {
	
}
