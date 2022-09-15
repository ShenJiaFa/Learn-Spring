package com.shenjiafa.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/14
 */
@Configuration
@ComponentScan("com.shenjiafa")
@PropertySource("jdbc.properties")
@Import({JdbcConfig.class,MybatisConfig.class})
public class SpringConfig {
}