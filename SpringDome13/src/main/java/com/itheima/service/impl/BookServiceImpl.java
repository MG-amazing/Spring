package com.itheima.service.impl;


import com.itheima.dao.BookDao;
import com.itheima.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    @Qualifier("bookDao")//自定名称装配 前面必须有Autowired
    //暴力反射,直接注入,自动装配
    private BookDao bookDao2;

    public void save() {
        System.out.println("book com.itheima.service save ... ");
        bookDao2.save();

    }
}
