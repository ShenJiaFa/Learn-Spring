package com.shenjiafa.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/19
 */
@Component
@Aspect
public class Advice {

    @Pointcut("execution(* com.shenjiafa.service.*Service.*(..))")
    private void servicePt() {
    }

    @Around("servicePt()")
    public void method(ProceedingJoinPoint joinPoint) throws Throwable {
        Signature signature = joinPoint.getSignature();
        String className = signature.getDeclaringTypeName();
        String methodName = signature.getName();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            joinPoint.proceed();
        }
        long end = System.currentTimeMillis();
        System.out.println("万次执行时间:" + className + "." + methodName + "--->" + (end - start) + "ms");
    }
}
