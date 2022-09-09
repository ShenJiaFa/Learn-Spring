package com.shenjiafa;

import com.shenjiafa.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/9
 */
public class RunAppShowSpringContainer {
    public static void main(String[] args) {
        ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("application-context.xml");
        ApplicationContext applicationContext2 = new FileSystemXmlApplicationContext("E:\\MyCode\\Learn-Spring\\Container\\src\\main\\resources\\application-context.xml");
        UserDao userDao1 = applicationContext1.getBean("userDao", UserDao.class);
        UserDao userDao2 = applicationContext2.getBean(UserDao.class);
        System.out.println(userDao1);
        System.out.println(userDao2);
        userDao1.save();
        userDao2.save();
    }
}
