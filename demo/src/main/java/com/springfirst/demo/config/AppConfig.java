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


    @Bean
    Person teacher(){return new Teacher();}



}