/*
 * @(#) AbstractUnitTest.java 2016/08/02
 * 
 * Copyright 2016 snow.com, Inc. All rights reserved.
 */
package com.snow.redis;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author snow
 * @version 2016/08/02
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-context.xml"})
public abstract class AbstractUnitTest {
    private static final Logger logger = LoggerFactory.getLogger(AbstractUnitTest.class);

//    @Test
//    public void stub() {
//        logger.info("msg from abstract unit test, just ignore this.");
//    }

    @After
    public void teardown() throws InterruptedException {
        logger.info("unit test complete.");
        TimeUnit.MILLISECONDS.sleep(500);// 因为有些测试是需要异步插入操作记录的，sleep一下等待线程结束
    }

}

