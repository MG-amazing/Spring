package com.itheima;


import com.itheima.config.SpringConfig;
import com.itheima.dao.BookDao;
import com.itheima.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App3 {
    public static void main(String[] args) {

        ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookService = (BookDao) ctx.getBean("bookDao");
        System.out.println(bookService);
        BookService bookService1=ctx.getBean(BookService.class);
        System.out.println(bookService1);
    }
}
