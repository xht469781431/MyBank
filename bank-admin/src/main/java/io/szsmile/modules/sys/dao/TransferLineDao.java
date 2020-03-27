package io.szsmile.modules.sys.dao;

import io.szsmile.modules.sys.entity.TransferLineEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 转账流水表
 * 
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:26
 */
@Mapper
public interface TransferLineDao extends BaseMapper<TransferLineEntity> {
	
}
