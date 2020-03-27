package io.szsmile.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.modules.sys.entity.TransferLineEntity;

import java.util.Map;

/**
 * 转账流水表
 *
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:26
 */
public interface TransferLineService extends IService<TransferLineEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

