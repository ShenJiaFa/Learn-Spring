package com.shenjiafa;

import com.shenjiafa.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/8
 */
public class RunAppShowThirdPartyBean {
    public static void main(String[] args) throws SQLException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        DataSource druidDataSource = (DataSource) applicationContext.getBean("druidDataSource");
        DataSource c3p0DataSource = (DataSource) applicationContext.getBean("c3p0DataSource");
        userDao.save();
        System.out.println(druidDataSource);
        System.out.println(c3p0DataSource);
    }
}
