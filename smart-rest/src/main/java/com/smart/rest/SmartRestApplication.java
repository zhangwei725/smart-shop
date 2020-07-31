package com.smart.rest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.smart.rest.mapper")
public class SmartRestApplication {
    public static void main(String[] args) {
        SpringApplication.run(SmartRestApplication.class, args);
    }
}
