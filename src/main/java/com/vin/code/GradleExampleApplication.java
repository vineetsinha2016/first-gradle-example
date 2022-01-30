package com.vin.code;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class GradleExampleApplication {
    public static void main (String[] args) {
        log.info("Starting Spring Boot Gradle example");
        SpringApplication.run(GradleExampleApplication.class);
    }
}
