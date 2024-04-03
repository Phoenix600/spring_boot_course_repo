package com.springfirst.demo.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Traveler {
    private Vehicle vehicle;
    public Traveler(Vehicle vehicle)
    {
        this.vehicle = vehicle;
    }

    public void startJourney(){
        this.vehicle.start();
    }
}
