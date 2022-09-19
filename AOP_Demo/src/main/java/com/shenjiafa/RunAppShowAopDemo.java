package com.shenjiafa;

import com.shenjiafa.config.SpringConfig;
import com.shenjiafa.dao.UserDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/15
 */
public class RunAppShowAopDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserDao userDao = annotationConfigApplicationContext.getBean(UserDao.class);
        userDao.save();
        //userDao.update();
    }
}
