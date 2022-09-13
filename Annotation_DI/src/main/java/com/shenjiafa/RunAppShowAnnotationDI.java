package com.shenjiafa;

import com.shenjiafa.config.SpringConfig;
import com.shenjiafa.dao.UserDao;
import com.shenjiafa.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/12
 */
public class RunAppShowAnnotationDI {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = applicationContext.getBean(UserService.class);
        userService.save();
    }
}