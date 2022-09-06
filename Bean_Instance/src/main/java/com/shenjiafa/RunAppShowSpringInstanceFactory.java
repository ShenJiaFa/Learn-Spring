package com.shenjiafa;

import com.shenjiafa.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/6
 */
public class RunAppShowSpringInstanceFactory {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        UserDao userDao = (UserDao)applicationContext.getBean("userDao");
        userDao.save();
    }
}
