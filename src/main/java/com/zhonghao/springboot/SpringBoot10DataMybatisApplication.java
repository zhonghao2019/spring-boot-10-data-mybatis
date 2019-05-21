package com.zhonghao.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 扫描接口所在包
 */
@MapperScan("com.zhonghao.springboot.mapper")
@SpringBootApplication
public class SpringBoot10DataMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot10DataMybatisApplication.class, args);
    }

}
