package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.itheima")
@PropertySource({"jdbc.properties"})//可以加载数组类型的变量 此处不支持使用通配符
public class SpringConfig {

}
