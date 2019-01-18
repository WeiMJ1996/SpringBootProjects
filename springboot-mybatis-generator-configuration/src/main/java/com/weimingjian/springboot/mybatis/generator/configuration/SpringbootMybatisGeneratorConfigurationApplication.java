package com.weimingjian.springboot.mybatis.generator.configuration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author weimingjian
 */
@SpringBootApplication
//@MapperScan("com.weimingjian.springboot.mybatis.generator.configuration.dao")
@tk.mybatis.spring.annotation.MapperScan(basePackages = "com.weimingjian.springboot.mybatis.generator.configuration.dao")
public class SpringbootMybatisGeneratorConfigurationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisGeneratorConfigurationApplication.class, args);
    }

}

