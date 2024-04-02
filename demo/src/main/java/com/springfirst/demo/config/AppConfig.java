package com.springfirst.demo.config;

import com.springfirst.demo.bean.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springfirst.demo.bean")
public class AppConfig {
    @Bean
    Student getStudentBean()
    {
        return  new Student();
    }
}
