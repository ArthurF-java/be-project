package com.beproject;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class BeProjectApplication {

    public static void main(String[] args) {
        log.info("DB_URL={}", System.getenv("DB_URL"));
        log.info("DB_USERNAME={}", System.getenv("DB_USERNAME"));
        log.info("DB_PASSWORD={}", System.getenv("DB_PASSWORD"));
        SpringApplication.run(BeProjectApplication.class, args);
    }

}
