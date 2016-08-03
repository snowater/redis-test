/*
 * @(#) AbstractRedisDao.java 2016/08/02
 * 
 * Copyright 2016 snow.com, Inc. All rights reserved.
 */
package com.snow.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

/**
* @author snow
* @version 2016/08/02
*/

public abstract class AbstractRedisDao<K, V> {

    @Autowired
    protected RedisTemplate<K, V> redisTemplate;

    // 设置redisTemplate
    public void setRedisTemplate(RedisTemplate<K, V> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    public RedisTemplate<K, V> getRedisTemplate() {
        return redisTemplate;
    }
}