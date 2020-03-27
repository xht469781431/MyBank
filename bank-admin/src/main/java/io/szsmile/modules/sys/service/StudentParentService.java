package io.szsmile.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.modules.sys.entity.StudentParentEntity;

import java.util.Map;

/**
 * 学生家长关系表
 *
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:26
 */
public interface StudentParentService extends IService<StudentParentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

