package com.shenjiafa;

import com.shenjiafa.config.SpringConfig;
import com.shenjiafa.controller.UserController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/22
 */
public class RunAppShowSpringMVC {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(SpringConfig.class);
        UserController userController = applicationContext.getBean(UserController.class);
        System.out.println(userController);
    }
}
