package com.shenjiafa;

import com.shenjiafa.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/7
 */
public class RunAppShowDIAutoWare {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.save();
    }
}
