package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {



    public void update() {
        System.out.println("book dao update ...");
    }

    public int select() {
        System.out.println("book dao select is running ...");
        return 100;
    }
}
