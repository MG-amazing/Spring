package com.itheima;

import com.itheima.dao.BookDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class AppForBeanFactory {
    public static void main(String[] args) {
        Resource recourse=new ClassPathResource("applicationContext.xml");

        BeanFactory bf=new XmlBeanFactory(recourse);
//        BookDao bookDao=bf.getBean(BookDao.class);
//        bookDao.save();

    }
}
