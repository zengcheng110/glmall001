package com.zc.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.zc.user.mapper")
public class GlmallUserApplication {

    public static void main(String[] args) {

        SpringApplication.run(GlmallUserApplication.class, args);
    }

}
