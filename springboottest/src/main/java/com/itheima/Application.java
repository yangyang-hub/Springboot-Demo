package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author:yangyang
 * @date:2019/9/25
 * @descriptiom:
 */
@SpringBootApplication
@EnableScheduling
@MapperScan("com.itheima.mapper")
public class Application {
    public static void main(String[] args) {
        //启动代码
        SpringApplication.run(Application.class,args);
    }
}
