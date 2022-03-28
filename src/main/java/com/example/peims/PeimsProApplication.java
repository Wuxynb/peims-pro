package com.example.peims;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
@MapperScan("com.example.peims.mapper") // 在编译之后都会生成相应的实现类
public class PeimsProApplication {

    public static void main(String[] args) {
        SpringApplication.run(PeimsProApplication.class, args);
    }

}
