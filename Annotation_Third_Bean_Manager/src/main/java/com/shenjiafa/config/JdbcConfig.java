package com.shenjiafa.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.shenjiafa.dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/14
 */
public class JdbcConfig {

    @Value("com.mysql.cj.jdbc.Driver")
    private String name;
    @Value("jdbc:mysql://localhost:3306/xxx_db")
    private String url;
    @Value("root")
    private String user;
    @Value("root")
    private String password;

    @Bean
    public DataSource getDataSource(UserDao userDao) {
        System.out.println(userDao);
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(name);
        druidDataSource.setUrl(url);
        druidDataSource.setUsername(user);
        druidDataSource.setPassword(password);
        return druidDataSource;
    }

}
