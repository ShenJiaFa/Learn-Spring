package com.shenjiafa.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/7
 */
public class RunAppShowDICollection {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("application-context.xml");
        BookDao bookDao = (BookDao) applicationContext.getBean("bookDao");
        bookDao.save();
    }
}
