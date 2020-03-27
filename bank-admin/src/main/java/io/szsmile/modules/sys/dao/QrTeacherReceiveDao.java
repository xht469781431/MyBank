package io.szsmile.modules.sys.dao;

import io.szsmile.modules.sys.entity.QrTeacherReceiveEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 教师二维码领用表
 * 
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:35
 */
@Mapper
public interface QrTeacherReceiveDao extends BaseMapper<QrTeacherReceiveEntity> {
	
}
