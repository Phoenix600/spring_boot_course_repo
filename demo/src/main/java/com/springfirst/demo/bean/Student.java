package com.springfirst.demo.bean;

import org.springframework.stereotype.Component;


public class Student implements Person{
    @Override
    public void intro(){
        System.out.println("Hey, Im student...");
    }
}
