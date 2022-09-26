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
    @Pointcut("execution(void com.itheima.dao.BookDao.update())")
    private void pt(){}

    @Before("pt()")//在当前可执行方法之后执行的方法
    public void method(){
        System.out.println(System.currentTimeMillis());
    }
}