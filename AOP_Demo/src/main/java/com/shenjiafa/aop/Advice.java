package com.shenjiafa.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
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
    @Pointcut("execution(void com.shenjiafa.dao.UserDao.*())")
    private void point() {
    }

    @Around("point()")
    public Object method(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object ret = null;
        for (int i = 0; i < 10000; i++) {
            ret = proceedingJoinPoint.proceed();
        }
        long end = System.currentTimeMillis();
        System.out.println("万次执行时间:"+(end - start));
        return ret;
    }
}
