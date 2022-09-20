package com.shenjiafa;

import com.shenjiafa.config.SpringConfig;
import com.shenjiafa.service.ResourcesService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/20
 */
public class RunAppHandlePassword {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        ResourcesService resourcesService = applicationContext.getBean(ResourcesService.class);
        if (resourcesService.openUrl("xxx.com", "root ")) {
            System.out.println("正确");
        } else {
            System.out.println("错误");
        }
    }
}
