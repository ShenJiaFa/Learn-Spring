package com.shenjiafa;

import com.shenjiafa.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/9
 */
public class RunAppShowApplicationContext {
    public static void main(String[] args) {
        ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("application-context.xml");
    }
}
