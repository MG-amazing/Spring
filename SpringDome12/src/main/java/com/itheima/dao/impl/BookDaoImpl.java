package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository
@Scope
public class BookDaoImpl implements BookDao {
    public void save() {
        System.out.println("book dao save ....");
    }
    @PostConstruct//构造方法之后执行
    public void init(){
        System.out.println("init ...");
    }
    @PreDestroy//销毁前执行
    public void destroy(){
        System.out.println("destroy ...");
    }
}
