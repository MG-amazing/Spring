package com.itheima;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.util.Properties;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSource= (DataSource) ctx.getBean("dataSource");
        System.out.println(dataSource);
        Properties properties=new Properties();
    }
}
