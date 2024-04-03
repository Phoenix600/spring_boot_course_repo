package com.springfirst.demo.bean;

import org.springframework.stereotype.Component;


public class Teacher implements Person{
    public void intro(){
        System.out.println("Im Teacher");
    }
}
