package com.itheima.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * @author:yangyang
 * @date:2019/9/25
 * @descriptiom:
 */
//@Configuration
//@PropertySource("classpath:application.yml")
//@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfig {
//    @Value("${jdbc.url}")
//    String url;
//    @Value("${jdbc.driverClassName}")
//    String driverClassName;
//    @Value("${jdbc.username}")
//    String username;
//    @Value("${jdbc.password}")
//    String password;

    @Bean
    // 声明要注入的属性前缀，Spring Boot会自动把相关属性通过set方法注入到DataSource中
    @ConfigurationProperties(prefix = "jdbc")
    public DataSource dataSource(){
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setDriverClassName(jdbc.getDriverClassName());
//        dataSource.setUrl(jdbc.getUrl());
//        dataSource.setUsername(jdbc.getUsername());
//        dataSource.setPassword(jdbc.getPassword());
        return new DruidDataSource();
    }

}
