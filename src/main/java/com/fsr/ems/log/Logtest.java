package com.fsr.ems.log;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Logtest {
    // 获取 Logger 实例
    public static Logger logger = LoggerFactory.getLogger(Logtest.class);

    public static void main(String[] args) {

      logger.error("aaaaaaa");
    }
}