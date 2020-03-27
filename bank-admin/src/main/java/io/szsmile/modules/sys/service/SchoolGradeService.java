package io.szsmile.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.modules.sys.entity.SchoolGradeEntity;

import java.util.Map;

/**
 * 年级表
 *
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:35
 */
public interface SchoolGradeService extends IService<SchoolGradeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

