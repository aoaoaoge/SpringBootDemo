package com.ao.demo.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

public class dataSourceConfiguration {

    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean(name = "dataSource")
    public DruidDataSource createDataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        return dataSource;
    }

}
