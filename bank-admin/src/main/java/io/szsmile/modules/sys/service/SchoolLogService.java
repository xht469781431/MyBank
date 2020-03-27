package io.szsmile.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.modules.sys.entity.SchoolLogEntity;

import java.util.Map;

/**
 * 学校操作日志表
 *
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:10
 */
public interface SchoolLogService extends IService<SchoolLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

