package com.itheima;

import com.itheima.config.SpringConfig;
import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App2 {
    public static void main(String[] args) {
        //创建核心容器 加载核心配置文件
        ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
        //调用核心容器 在核心容器中获取Bean
        AccountService accountService = ctx.getBean(AccountService.class);
        //调用在IOC容器中获得的对象,并执行对象相关方法
        Account ac = accountService.findById(2);
        System.out.println(ac);

    }
}
