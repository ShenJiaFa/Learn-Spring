package com.shenjiafa;

import com.shenjiafa.config.SpringConfig;
import com.shenjiafa.service.AccountService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/15
 */
public class RunAppSpringMybatis {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = annotationConfigApplicationContext.getBean(AccountService.class);
        System.out.println(accountService.findById(1));
    }
}
