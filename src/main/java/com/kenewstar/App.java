package com.kenewstar;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: kenewstar
 * @Description: springboot启动类
 * @Date:Created in 2020/5/29
 */
@SpringBootApplication
@MapperScan("com.kenewstar.mapper")
public class App {
    public static void main(String[] args) {

        SpringApplication.run(App.class,args);
    }
}
