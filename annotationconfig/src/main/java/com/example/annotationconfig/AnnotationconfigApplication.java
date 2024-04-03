package com.example.annotationconfig;

import com.example.annotationconfig.bean.Teacher;
import com.example.annotationconfig.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class AnnotationconfigApplication {

	public static void main(String[] args) {

		SpringApplication.run(AnnotationconfigApplication.class, args);
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Teacher t = context.getBean(Teacher.class);
		t.intro();
	}

}
