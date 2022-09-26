package com.itheima.service.impl;

import com.itheima.dao.BookDao;

import com.itheima.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookServiceImpl implements BookService , InitializingBean, DisposableBean {
    private BookDao bookDao;
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }


    public void save() {
        System.out.println("BookServiceImpl");
        bookDao.save();
    }
    public void destroy() throws Exception {
        System.out.println("com.itheima.service destroy");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("com.itheima.service init");
    }


}
