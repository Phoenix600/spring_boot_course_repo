package com.springfirst.demo;

import com.springfirst.demo.bean.*;
import com.springfirst.demo.config.AppConfig;
import org.apache.naming.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


/**
 * Example of java based spring bean configuration
 */
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class,args);

   
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Car c = context.getBean(Car.class);
		c.start();

		Bike b = (Bike)context.getBean("bike");
		b.start();

		Cycle c1 = context.getBean("cycle", Cycle.class);
		c1.start();

		Traveler traveler = context.getBean("traveler",Traveler.class);
		traveler.startJourney();

		Person p = context.getBean(Teacher.class);
		p.intro();

	}

}
