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
        System.out.println(resourcesService.openUrl("xxx.com", "root ") ? "正确" : "错误");
    }
}
