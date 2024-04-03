package com.springfirst.demo.config;

import com.springfirst.demo.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.beans.VetoableChangeListener;

@Configuration
//@ComponentScan(basePackages = "com.springfirst.demo.bean")
public class AppConfig {

    @Bean
    Vehicle car()
    {
        return new Car();
    }

    @Bean("bike")
    Vehicle bike()
    {
        return new Bike();
    }

    @Bean("cycle")
    Vehicle cycle()
    {
        return new Cycle();
    }

    @Bean("traveler")
    Traveler traveler()
    {
        return new Traveler(bike());
    }
<<<<<<< HEAD


    @Bean
    Person teacher(){return new Teacher();}



=======
>>>>>>> c64cf53f15b72b59b6edb6b80824a5c8641e3ed9
}