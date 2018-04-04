package com.light.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
该注解指定项目为springboot，由此类当作程序入口
自动装配 web 依赖的环境

**/
@SpringBootApplication
public class SpringbootApplication {

   public static void main(String[] args) {
       SpringApplication.run(SpringbootApplication.class, args);
   }
}
