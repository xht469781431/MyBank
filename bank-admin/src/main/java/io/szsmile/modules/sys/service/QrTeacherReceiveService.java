package io.szsmile.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.szsmile.common.utils.PageUtils;
import io.szsmile.modules.sys.entity.QrTeacherReceiveEntity;

import java.util.Map;

/**
 * 教师二维码领用表
 *
 * @author lipan
 * @email 1171205514@qq.com
 * @date 2020-03-12 15:46:35
 */
public interface QrTeacherReceiveService extends IService<QrTeacherReceiveEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

