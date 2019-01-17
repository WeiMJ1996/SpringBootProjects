package com.weimingjian.springboot.mybatis.starter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author weimingjian
 */
@SpringBootApplication
@MapperScan("com.weimingjian.springboot.mybatis.starter.dao")
public class SpringbootMybatisStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisStarterApplication.class, args);
    }

}

