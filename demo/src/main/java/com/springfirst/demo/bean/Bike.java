package com.springfirst.demo.bean;

public class Bike implements Vehicle{
    @Override
    public void start() {
        System.out.println("Bike started....");
    }
}
