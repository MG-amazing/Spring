package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Service("bookDao")
@Repository("bookDao")
public class BookDaoImpl implements BookDao {

    public void save() {
        System.out.println("book dao save .....");
    }
}
