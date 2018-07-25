package com.skq.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by skq on 2018/7/24.
 */
public class HelloSlf4j {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(HelloSlf4j.class);
        logger.error("error  slf4j");

    }
}
