package com.itheima.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
//通知类型一般分为5种
//前置通知
//后置通知
//环绕通知
//返回后通知
//抛出异常后通知

public class Advice {
    @Pointcut("execution(void com.itheima.dao.BookDao.update())")
    private void pt() {
    }
    @Pointcut("execution(int com.itheima.dao.BookDao.select())")
    private void pt2() {
    }

//    @Before("pt()")
    public void before() {
        System.out.println("before advice ...");
    }
//    @After("pt()")
    public void after() {
        System.out.println("after advice ...");
    }
//    @Around("pt()")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before advice ...");
        //表示对原始方法的调用
        pjp.proceed();
        System.out.println("around after advice ...");
    }
//    @Around("pt2()")
    public Object aroundSelect(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before advice ...");
        //表示对原始方法的调用
        pjp.proceed();
        Integer ret= (Integer) pjp.proceed();
        System.out.println("around after advice ...");
        return ret;
    }
//    @AfterReturning("pt2()")//只有在正常情况,无异常情况下才可以运行
    public void afterReturning() {
        System.out.println("afterReturning advice ...");
    }
    @AfterThrowing("pt2()")//只有在出现异常之后才会执行此操作
    public void aroundThrowing() {
        System.out.println("afterThrowing advice ...");
    }

}