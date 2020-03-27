package io.szsmile.modules.sys.dao;

import io.szsmile.modules.sys.entity.CommonRemarkEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 通用评语表
 * 
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:35
 */
@Mapper
public interface CommonRemarkDao extends BaseMapper<CommonRemarkEntity> {
	
}
