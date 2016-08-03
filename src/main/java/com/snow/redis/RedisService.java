/*
 * @(#) ArchiveLogRedisServiceImpl.java 2016/03/10
 * 
 * Copyright 2013 NetEase.com, Inc. All rights reserved.
 */
package com.snow.redis;

/**
 * 
 * @author snow
 * @date 2016/03/10
 */
public interface RedisService {

    public void setStr(String key, String value);
    
    public String getStr(String key);
    
    public void rPushList(String key, String value);

    public String lPopList(String key);

    public void delKey(String key);

}
