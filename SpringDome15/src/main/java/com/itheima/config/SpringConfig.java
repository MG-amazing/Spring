package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.itheima")
//将jdbc.properties抽取到核心容器中去
@PropertySource({"jdbc.properties"})
@Import({JdbcConfig.class,MybatisConfig.class})
public class SpringConfig {
}
