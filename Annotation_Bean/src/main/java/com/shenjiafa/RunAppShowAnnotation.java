package com.shenjiafa;

import com.shenjiafa.dao.UserDao;
import com.shenjiafa.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/2
 */
public class RunAppShowAnnotation {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        UserDao userDao = applicationContext.getBean("userDao", UserDao.class);
        System.out.println(userDao);
        UserService userService = applicationContext.getBean(UserService.class);
        System.out.println(userService);
    }
}
