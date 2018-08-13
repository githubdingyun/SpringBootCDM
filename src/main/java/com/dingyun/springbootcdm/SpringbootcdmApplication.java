package com.dingyun.springbootcdm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dingyun.springbootcdm.dao")
public class SpringbootcdmApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootcdmApplication.class, args);
    }
}
