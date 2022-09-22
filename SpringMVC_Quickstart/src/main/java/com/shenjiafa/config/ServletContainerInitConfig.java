package com.shenjiafa.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/22
 */
public class ServletContainerInitConfig extends AbstractDispatcherServletInitializer {
    @Override
    protected WebApplicationContext createServletApplicationContext() {
        AnnotationConfigWebApplicationContext applicationContext=new AnnotationConfigWebApplicationContext();
        applicationContext.register(SpringMVCConfig.class);
        return applicationContext;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    protected WebApplicationContext createRootApplicationContext() {
        AnnotationConfigWebApplicationContext applicationContext=new AnnotationConfigWebApplicationContext();
        applicationContext.register(SpringConfig.class);
        return applicationContext;
    }
}
