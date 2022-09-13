package com.shenjiafa;

import com.shenjiafa.config.SpringConfig;
import com.shenjiafa.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/12
 */
public class RunAppShowAnnotationBeanManager {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserDao userDao1 = applicationContext.getBean("userDao", UserDao.class);
        UserDao userDao2 = applicationContext.getBean("userDao", UserDao.class);
        System.out.println(userDao1);
        System.out.println(userDao2);
        applicationContext.close();
    }
}
