package com.springfirst.demo.bean;

<<<<<<< HEAD



=======
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
>>>>>>> c64cf53f15b72b59b6edb6b80824a5c8641e3ed9
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
