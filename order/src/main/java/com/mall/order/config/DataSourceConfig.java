package com.mall.order.config;

import com.zaxxer.hikari.HikariDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @author acai
 * @date 2020/8/7
 **/
@Configuration
@EnableTransactionManagement
@MapperScan("com.mall.order.mapper")
public class DataSourceConfig {

    @Value("${spring.datasource.driver-class-name}")
    private String driverClass;

    @Value("${spring.datasource.username=}")
    private String userName;

    @Value("${spring.datasource.password}")
    private String passWord;

    @Value("${spring.datasource.url}")
    private String jdbcUrl;

    @Bean
    public DataSourceTransactionManager dataSourceTransactionManager() {
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource());
        return dataSourceTransactionManager;
    }
    @Bean
    public DataSource dataSource(){
        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setDataSourceClassName(driverClass);
        hikariDataSource.setJdbcUrl(jdbcUrl);
        hikariDataSource.setUsername(userName);
        hikariDataSource.setPassword(passWord);
        return hikariDataSource;
    }
    @Bean
    public DataSourceTransactionManager transactionManager(){
        return new DataSourceTransactionManager(dataSource());

    }
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}
