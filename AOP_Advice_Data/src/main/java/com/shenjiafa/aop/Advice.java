package com.shenjiafa.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/20
 */
@Component
@Aspect
public class Advice {
    @Pointcut("execution(String com.shenjiafa.dao.BookDao.findName(*,*))")
    private void pt() {
    }

    // @Before("pt()")
    public void before(JoinPoint jp) {
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("before advice...");
    }

    // @After("pt()")
    public void after(JoinPoint jp) {
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("after advice...");
    }

    // @Around("pt()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        System.out.println("原参数为"+Arrays.toString(args));
        args[0]=200;
        args[1]="SJF";
        Object ret = pjp.proceed(args);
        return ret;
    }

    @AfterReturning(value = "pt()",returning = "ret")
    public void afterReturning(String ret) {
        System.out.println("afterReturning advice..."+ret);
    }

    @AfterThrowing(value = "pt()",throwing = "t")
    public void afterThrowing(Throwable t) {
        System.out.println("afterThrowing advice..."+t);
    }

}
