package com.iwhalecloud.springbootlogging;

import org.junit.jupiter.api.Test;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class SpringbootloggingApplicationTests {

    Logger logger= LoggerFactory.getLogger(getClass());

    @Test
    void contextLoads() {
        logger.trace("this is trace");
        logger.debug("this is a debug");
        logger.info("this is a info");
        logger.warn("this is  a warn");
        logger.error("this is a error");
    }

}
