package com.shenjiafa;

import com.shenjiafa.dao.OrderDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/5
 */
public class RunAppShowSpringStaticFactory {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        OrderDao orderDao = (OrderDao) applicationContext.getBean("orderDao");
        orderDao.save();
    }
}
