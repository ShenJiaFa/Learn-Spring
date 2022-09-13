package com.shenjiafa.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/12
 */
@Configuration
@ComponentScan({"com.shenjiafa.dao", "com.shenjiafa.service"})
@PropertySource("jdbc.properties")
public class SpringConfig {
}
