package com.example.dockertest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.dockertest.dao")
public class DockertestApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockertestApplication.class, args);
    }

}
