package com.itheima;

import com.itheima.config.SpringConfig;
import com.itheima.service.ResourcesService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
        ResourcesService resourcesService=ctx.getBean(ResourcesService.class);
        boolean flag=resourcesService.openUrl("http://baidu.com","root ");
        System.out.println(flag);
    }
}
