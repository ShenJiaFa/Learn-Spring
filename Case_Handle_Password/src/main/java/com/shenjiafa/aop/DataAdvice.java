package com.shenjiafa.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/20
 */
@Component
@Aspect
public class DataAdvice {

    @Pointcut("execution(boolean com.shenjiafa.service.*Service.*(*,*))")
    private void servicePt() {
    }

    @Around("DataAdvice.servicePt()")
    public Object trimPwd(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        for (int i = 0; i < args.length; i++) {
            if (Objects.equals(args[i].getClass(), String.class)) {
                args[i] = args[i].toString().trim();
            }
        }
        return pjp.proceed(args);
    }
}
