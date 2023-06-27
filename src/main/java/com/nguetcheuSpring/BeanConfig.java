package com.nguetcheuSpring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.nguetcheuSpring")
@EnableAspectJAutoProxy
public class BeanConfig {
}
