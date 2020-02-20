package com.example.builddemo;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class BuilddemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BuilddemoApplication.class, args);
        log.info("Hello World !");
        log
    }
}
