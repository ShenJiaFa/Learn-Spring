package com.shenjiafa.base_config;

import com.shenjiafa.base_config.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/2
 */
public class RunAppUseName {
    public static void main(String[] args) {
        // 获取IOC容器
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("application-context.xml");
        // 从容器中获取Bean:userService
        UserService userService = (UserService)applicationContext.getBean("service");
        userService.save();
    }
}
