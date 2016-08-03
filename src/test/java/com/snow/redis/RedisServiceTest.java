/*
 * @(#) AbstractUnitTest.java 2016/08/02
 * 
 * Copyright 2016 snow.com, Inc. All rights reserved.
 */
package com.snow.redis;

import javax.annotation.Resource;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author snow
 * @version 2016/08/02
 */

public class RedisServiceTest extends AbstractUnitTest {
    private static final Logger logger = LoggerFactory.getLogger(RedisServiceTest.class);

    @Resource
    private RedisService redisService;

    @Test
    public void testSetStr() {
        String key = "test";
        String value = "valuetest";
        redisService.setStr(key, value);
    }

    @Test
    public void testGetStr() {
        String key = "test";
        String value = redisService.getStr(key);
        logger.info("The value is {}", value);
    }

    @Test
    public void testRPushList() {
        String key = "list";
        for (int i = 0; i < 10; i++) {
            redisService.rPushList(key, String.valueOf(i));
        }
    }
    
    
    @Test
    public void testLPopList() {
        String key = "list";
        
        for(int i = 0; i < 9; i++) {
            String value = redisService.lPopList(key);
            logger.info("lpop value is {}", value);
        }
    }
    
    @Test
    public void testDelKey() {
        String key = "list";
        redisService.delKey(key);
    }
    

}
