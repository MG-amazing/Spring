package com.itheima;

import com.itheima.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        //加载类路径下的配置文件
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");

        // BookDao bookDao= ctx.getBean("bookDao",BookDao.class);
        //根据bean类型获取
        BookDao bookDao=ctx.getBean(BookDao.class);
        bookDao.save();
    }
}
