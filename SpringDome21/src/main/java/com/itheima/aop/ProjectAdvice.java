package com.itheima.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ProjectAdvice {

    @Pointcut("execution(* com.itheima.service.*Service.*(..))")
    private void servicePt(){

    }
    @Around("ProjectAdvice.servicePt()")
    private  void runSpeed(ProceedingJoinPoint pjp) throws Throwable {
        Signature signature=pjp.getSignature();
        String className=signature.getDeclaringTypeName();
        String methodName=signature.getName();

        long start=System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            pjp.proceed();
        }
        long end=System.currentTimeMillis();
        System.out.println("万次执行: "+className+"."+methodName+"----->"+(end-start)+"ms");

    }
}
