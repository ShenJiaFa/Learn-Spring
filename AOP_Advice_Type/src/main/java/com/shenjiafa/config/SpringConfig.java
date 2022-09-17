package com.shenjiafa.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/17
 */
@Configuration
@ComponentScan("com.shenjiafa")
@EnableAspectJAutoProxy
public class SpringConfig {
}
