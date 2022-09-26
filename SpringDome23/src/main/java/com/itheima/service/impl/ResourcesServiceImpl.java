package com.itheima.service.impl;

import com.itheima.dao.RecourseDao;
import com.itheima.service.ResourcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResourcesServiceImpl implements ResourcesService {
    @Autowired
    private RecourseDao recourseDao;
    public boolean openUrl(String url, String password) {
        return recourseDao.readResources(url,password);
    }
}
