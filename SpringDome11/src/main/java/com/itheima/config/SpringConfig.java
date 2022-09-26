package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//可以接一个数组
@ComponentScan({"com.itheima","com.itheima.dao"})
public class SpringConfig {


}
