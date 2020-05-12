package com.example.vuetest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.vuetest.mapper")
public class VuetestApplication {

    public static void main(String[] args) {
        SpringApplication.run(VuetestApplication.class, args);
    }

}
