package com.springfirst.demo.bean;


import org.springframework.stereotype.Component;


public class Supervisor implements Person{
    public void intro(){
        System.out.println("Im Supervisor...");
    }
}
