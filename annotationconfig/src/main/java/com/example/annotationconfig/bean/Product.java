package com.example.annotationconfig.bean;

import org.springframework.stereotype.Component;

import java.util.Date;


@Component
public class Product {
    public String name;
    public double price;
    Date date  = new Date("12/12/2023");

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", date=" + date +
                '}';
    }
}
