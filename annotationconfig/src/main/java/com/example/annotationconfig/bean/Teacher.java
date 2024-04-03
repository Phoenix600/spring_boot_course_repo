package com.example.annotationconfig.bean;


import org.springframework.stereotype.Component;

@Component
public class Teacher implements Person{
    @Override
    public void intro() {
        System.out.println("I'm Teacher");
    }
}
