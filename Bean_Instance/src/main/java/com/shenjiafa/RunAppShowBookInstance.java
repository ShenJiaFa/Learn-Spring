package com.shenjiafa;

import com.shenjiafa.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/5
 */
public class RunAppShowBookInstance {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        BookDao bookDao = (BookDao) applicationContext.getBean("bookDao");
        bookDao.save();
    }
}
