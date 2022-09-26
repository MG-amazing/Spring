package com.itheima.factory;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;

public class UserDaoFactoryBean implements FactoryBean<UserDao> {
    //代替原始实例工厂中创建对象的方法
    //此方法是创造原始工厂对象
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }
    //此方法是用于得到Bean的类型的
    public Class<?> getObjectType() {
        return UserDao.class;
    }
    //此方法是确定Bean的类型是否是单例的
    public boolean isSingleton() {
        return true;
    }
}
