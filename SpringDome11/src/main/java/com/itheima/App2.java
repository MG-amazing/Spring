package com.itheima;


import com.itheima.dao.BookDao;
import com.itheima.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookDao bookService = (BookDao) ctx.getBean("bookDao");
        System.out.println(bookService);
        BookService bookService1=ctx.getBean(BookService.class);
        System.out.println(bookService1);
    }
}
