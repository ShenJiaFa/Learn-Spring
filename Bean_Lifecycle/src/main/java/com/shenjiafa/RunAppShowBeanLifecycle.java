package com.shenjiafa;

import com.shenjiafa.dao.UserDao;
import com.shenjiafa.service.UserService;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/7
 */
public class RunAppShowBeanLifecycle {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        applicationContext.registerShutdownHook();
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.save();

    }
}
