package com.beproject;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@Slf4j
@EnableCaching
@SpringBootApplication
public class BeProjectApplication {


    public static void main(String[] args) {
//        log.info("REDIS_HOST={}", System.getenv("REDIS_HOST"));
//        log.info("REDIS_PORT={}", System.getenv("REDIS_PORT"));
//        log.info("REDIS_PASSWORD={}", System.getenv("REDIS_PASSWORD"));
        SpringApplication.run(BeProjectApplication.class, args);
    }
}
