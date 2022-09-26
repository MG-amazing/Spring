package com.itheima.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.itheima")
//将jdbc.properties抽取到核心容器中去
@PropertySource({"jdbc.properties"})
@Import({JdbcConfig.class,MybatisConfig.class})
@EnableAspectJAutoProxy//开启AOP注解开发
public class SpringConfig {
}
