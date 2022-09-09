package com.shenjiafa;

import com.shenjiafa.dao.UserDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/9
 */
public class RunAppShowBeanFactory {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("application-context.xml");
    }
}
