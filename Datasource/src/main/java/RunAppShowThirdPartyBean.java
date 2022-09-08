import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/8
 */
public class RunAppShowThirdPartyBean {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        DataSource druidDataSource = (DataSource) applicationContext.getBean("druidDataSource");
        DataSource c3p0DataSource = (DataSource) applicationContext.getBean("c3p0DataSource");
        System.out.println(druidDataSource);
        System.out.println(c3p0DataSource);
    }
}
