package com.springfirst.demo.bean;

public class Car implements  Vehicle{
    @Override
    public void start()
    {
        System.out.println("Car started....");
    }
}
