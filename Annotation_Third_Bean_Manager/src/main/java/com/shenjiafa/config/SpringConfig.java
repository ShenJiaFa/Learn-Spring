package com.shenjiafa.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.sql.DataSource;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/12
 */
@Configuration
@ComponentScan("com.shenjiafa.dao")
@Import(JdbcConfig.class)
public class SpringConfig {
}
