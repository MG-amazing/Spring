package com.itheima.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.itheima.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class JdbcConfig {
    @Value("com.mysql.jdbc.Driver")
    private String driver;
    @Value("jdbc:n=mysql://localhost:3306")
    private String url;
    @Value("root")
    private String username;
    @Value("123456")
    private String password;
    //1.定义一个方法获得要管理的对象
    //2.添加@Bean,表示当前方法的返回值是一个Bean
    @Bean
    public DataSource dataSource(BookDao bookDao) {
        //引用类型中的bean 会在容器中扫描若扫描不到则会报错 若有会按类型装配 若有多个会报错
        System.out.println(bookDao);
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setUsername(username);
        ds.setPassword(password);
        return ds;
    }
}
