package com.shenjiafa.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/22
 */
@Configuration
@ComponentScan({"com.shenjiafa.service", "com.shenjiafa.dao"})
public class SpringConfig {
}
