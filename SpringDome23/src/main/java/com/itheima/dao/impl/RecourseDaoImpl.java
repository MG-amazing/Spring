package com.itheima.dao.impl;

import com.itheima.dao.RecourseDao;
import org.springframework.stereotype.Repository;

@Repository
public class RecourseDaoImpl implements RecourseDao {

    public boolean readResources(String url, String password) {
        return password.equals("root");
    }
}
