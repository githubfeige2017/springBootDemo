package com.feige.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

//@Configuration

public class JdbcConfig {
/*
    @Value("jdbc:mysql://127.0.0.1:3306/mmall")
    String url;
    @Value("com.mysql.jdbc.Driver")
    String driverClassName;
    @Value("root")
    String username;
    @Value("123")
    String password;

    @Bean
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(url);
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }*/
}