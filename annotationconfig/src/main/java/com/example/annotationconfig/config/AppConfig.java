package com.example.annotationconfig.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.annotationconfig.bean")
public class AppConfig {
}
