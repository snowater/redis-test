/*
 * @(#) ArchiveLogRedisServiceImpl.java 2016/03/10
 * 
 * Copyright 2013 NetEase.com, Inc. All rights reserved.
 */
package com.snow.redis;

import org.springframework.stereotype.Service;

/**
 * 
 * @author snow
 * @date 2016/03/10
 */
@Service(value = "redisService")
public class RedisServiceImpl extends AbstractRedisDao<String, String> implements RedisService {

    @Override
    public void setStr(String key, String value) {
        getRedisTemplate().opsForValue().set(key, value);
    }

    @Override
    public String getStr(String key) {
        return getRedisTemplate().opsForValue().get(key);
    }

    @Override
    public void rPushList(String key, String value) {
        getRedisTemplate().opsForList().rightPush(key, value);

    }

    @Override
    public String lPopList(String key) {
        return getRedisTemplate().opsForList().leftPop(key);
    }
    
    @Override
    public void delKey(String key) {
        getRedisTemplate().delete(key);
    }

}
