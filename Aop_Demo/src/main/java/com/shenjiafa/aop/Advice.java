package com.shenjiafa.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/15
 */
@Component
@Aspect
public class Advice {
    @Pointcut("execution(void com.shenjiafa.dao.UserDao.save())")
    private void point(){}

    @Before("point()")
    void method() {
        long start = System.currentTimeMillis();
        System.out.println(start);
    }
}
