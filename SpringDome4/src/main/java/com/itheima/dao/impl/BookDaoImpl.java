package com.itheima.dao.impl;

import com.itheima.dao.BookDao;

public class BookDaoImpl implements BookDao {
    public void save() {
        System.out.println("BookDaoImpl save ....");
    }
    //表示bean初始化对应的操作
    public void init(){
        System.out.println("init...");
    }
    public void destroy(){
        System.out.println("destroy...");
    }
}
