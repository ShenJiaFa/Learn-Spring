package com.shenjiafa;

import com.shenjiafa.config.SpringConfig;
import com.shenjiafa.dao.UserDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/12
 */
public class RunAppShowAnnotationThirdBeanManager {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        DataSource dataSource = applicationContext.getBean(DataSource.class);
        System.out.println(dataSource);
    }
}
