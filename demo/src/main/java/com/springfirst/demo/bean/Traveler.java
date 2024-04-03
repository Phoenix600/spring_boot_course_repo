package com.springfirst.demo.bean;




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
