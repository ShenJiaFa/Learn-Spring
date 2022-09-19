package com.shenjiafa.config;

import org.springframework.context.annotation.*;

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
@EnableAspectJAutoProxy
public class SpringConfig {
}