package com.shenjiafa.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/17
 */
@Component
@Aspect
public class Advice {
    @Pointcut("execution(int com.shenjiafa.dao.UserDao.select())")
    private void point() {
    }

    //@Before("point()")
    public void before() {
        System.out.println("before advice...");
    }

    //@After("point()")
    public void after() {
        System.out.println("after advice...");
    }

    @Around("point()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("before advice...");
        Object ret = proceedingJoinPoint.proceed();
        System.out.println("after advice...");
        return ret;
    }

    public void afterRunning() {
        System.out.println("before advice...");
    }

    public void afterThrowing() {
        System.out.println("before advice...");
    }

}
