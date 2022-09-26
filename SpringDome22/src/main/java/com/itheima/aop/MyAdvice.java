package com.itheima.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect

public class MyAdvice {
    @Pointcut("execution(* com.itheima.dao.BookDao.finByName(..))")
    private void pt(){
    }
//    @Before("pt()")
    public void before(JoinPoint pjp){
        Object[] args = pjp.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("before advice ...");
    }

//    @After("pt()")
    public void after(JoinPoint pjp){
        Object[] args = pjp.getArgs();
        args[0]=200;
        System.out.println(Arrays.toString(args));
        System.out.println("after advice ...");
    }
//    @Around("pt()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        System.out.println(Arrays.toString(args));
        args[0]=666;
        Object ret=pjp.proceed(args);
        return ret;
    }
//    @AfterReturning(value = "pt()",returning = "ret")
    //必须先放JoinPoint
    public void afterReturning(JoinPoint jp,Object ret){
        System.out.println("after Returning advice ..."+ret);
    }
    @AfterThrowing(value = "pt()",throwing = "t")
    public void afterThrowing(Throwable t){
        System.out.println("afterThrowing advice ..."+t);
    }


}