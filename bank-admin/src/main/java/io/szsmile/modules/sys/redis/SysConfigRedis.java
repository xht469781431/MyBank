/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package io.szsmile.modules.sys.redis;


import io.szsmile.common.utils.RedisKeys;
import io.szsmile.common.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 系统配置缓存操作的工具类
 *
 * @author Mark sunlightcs@gmail.com
 */
@Component
public class SysConfigRedis {

    @Autowired
    private RedisUtils redisUtils;

    /**
     * 添加或者修改系统配置信息
     * @param config
     */
    public void saveOrUpdate(SysConfigEntity config) {
        if(config == null){
            return ;
        }
        //将系统配置的参数key作为存储到redis的key
        String key = RedisKeys.getSysConfigKey(config.getParamKey());//RedisKeys.getSysConfigKey()包装了数据的样式
        //redis存储key-value
        redisUtils.set(key, config); //这里的存储没有设置过期时间
    }

    /**
     * 根据key,删除value
     * @param configKey
     */
    public void delete(String configKey) {
        String key = RedisKeys.getSysConfigKey(configKey);
        redisUtils.delete(key);
    }

    /**
     * 根据key获取value
     * @param configKey
     * @return
     */
    public SysConfigEntity get(String configKey){
        String key = RedisKeys.getSysConfigKey(configKey);
        return redisUtils.get(key, SysConfigEntity.class);
    }
}
