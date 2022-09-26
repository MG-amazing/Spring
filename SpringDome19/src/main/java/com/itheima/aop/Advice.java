package com.itheima.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect

public class Advice {
    //AOP表达式
    //*代表通配
    // public * com.itheima.*.UserService.find*(*)
    //..多个连续的任意符号,常用于简化包名与参数的书写
    //public User com..UserService.findById(..)
    //+专用于匹配子类类型
    // * *..*Service+.*(..)

    //@Pointcut("execution(void com.itheima.dao.BookDao.update())")
    //@Pointcut("execution(void  com.itheima.dao.impl.BookDaoImpl.update())")
    //@Pointcut("execution(* com.itheima.dao.impl.BookDaoImpl.update(*))")
    //@Pointcut("execution(void com..*.*.*.*.update())")
    //@Pointcut("execution(void com..*.*.*.update())")
    //@Pointcut("execution(void *..update())")
    //@Pointcut("execution(* *..*(..))")
    //@Pointcut("execution(* *..u*(..))")//匹配u开头的方法
    //@Pointcut("execution(void com..*())")
    //@Pointcut("execution(* com.itheima.*.Service.find*(..))")//业务层全部加此方法
    @Pointcut("execution(* com.itheima.*.*Service.save(..))")//业务层所有的保存方法应用此方法





    private void pt(){}

    @Before("pt()")//在当前可执行方法之后执行的方法
    public void method(){
        System.out.println(System.currentTimeMillis());
    }
}