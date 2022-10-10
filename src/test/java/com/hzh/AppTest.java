package com.hzh;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.helpers.LogLog;
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
        // 加载初始化配置
        BasicConfigurator.configure();
        Logger logger = Logger.getLogger(AppTest.class);
        logger.info("Hello log4j!!!");
    }

    /**
     * 输出级别
     */
    @Test
    void test002() {
        // 加载初始化配置
        BasicConfigurator.configure();
        Logger logger = Logger.getLogger(AppTest.class);

        logger.fatal("fatal");
        logger.error("error");
        logger.warn("warn");
        logger.info("info");
        logger.debug("debug");
        logger.trace("trace");
    }

    /**
     * 使用配置文件
     */
    @Test
    void test003() {
        Logger logger = Logger.getLogger(AppTest.class);

        logger.fatal("fatal");
        logger.error("error");
        logger.warn("warn");
        logger.info("info");
        logger.debug("debug");
        logger.trace("trace");
    }

    /**
     * 输出Log4j本身的日志
     */
    @Test
    void test004() {
        // 输出Log4j本身的日志
        LogLog.setInternalDebugging(true);
        Logger.getLogger(AppTest.class);
    }

    /**
     * 自定义logger
     */
    @Test
    void test005() {
        Logger logger = Logger.getLogger(AppTest.class);

        logger.fatal("fatal");
        logger.error("error");
        logger.warn("warn");
        logger.info("info");
        logger.debug("debug");
        logger.trace("trace");
    }

    /**
     * apache logger
     */
    @Test
    void test006() {
        Logger logger = Logger.getLogger(AppTest.class);

        logger.fatal("fatal");
        logger.error("error");
        logger.warn("warn");
        logger.info("info");
        logger.debug("debug");
        logger.trace("trace");

        Logger logger1 = Logger.getLogger(Logger.class);

        logger1.fatal("fatal");
        logger1.error("error");
        logger1.warn("warn");
        logger1.info("info");
        logger1.debug("debug");
        logger1.trace("trace");
    }

}
