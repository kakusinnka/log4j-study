package com.hzh;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
class AppTest {

    /**
     * 简单使用
     */
    @Test
    void test001() {
        // 加载初始化
        BasicConfigurator.configure();
        Logger logger = Logger.getLogger(AppTest.class);
        logger.info("Hello log4j!!!");
    }

    /**
     * 输出级别
     */
    @Test
    void test002() {
        // 加载初始化
        BasicConfigurator.configure();
        Logger logger = Logger.getLogger(AppTest.class);
        logger.info("Hello log4j!!!");
        logger.info("Hello log4j!!!");
    }
}
