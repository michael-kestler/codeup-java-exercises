package com.in28minutes.oops;

public class MotorBike {

    //MotorBike is acting as a template
    //objects have
    //state
    private int speed; //instance variable
    //behavior
    //method
    //inputs - int speed
    //outputs - void
    //name - setSpeed


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    void start() {
        System.out.println("Bike Started");
    }
}
