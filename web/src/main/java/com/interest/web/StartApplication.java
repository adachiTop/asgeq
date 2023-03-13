package com.interest.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author glk
 * @date 2023/3/13
 */
@Slf4j
@SpringBootApplication
public class StartApplication {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        SpringApplication.run(StartApplication.class, args);
        long endTime = System.currentTimeMillis();
        log.info("项目已启动，花费{}ms", (endTime - startTime));
    }
}
