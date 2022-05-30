package com.in28minutes.oops;

public class Fan {
    //state of the object
    private String make;
    private double radius;
    private String color;

    //expose behavior on these
    private boolean isOn;
    private byte speed; //0 to 5

    //creation - constructors

    public Fan(String make, double radius, String color){
        this.make = make;
        this.radius = radius;
        this.color = color;

    }

    //print the state of the current object
    public String toString(){
       return String.format("make - %s, radius - %f, color - %s, isOn - %b, speed - %d",
                make, radius, color, isOn, speed);


    }

    public void switchOn(){
        this.isOn = true;
        setSpeed((byte) 5);
    }

    public void switchOff(){
        this.isOn = false;
        setSpeed((byte) 0);
    }

    public void setSpeed(byte speed){
        this.speed = speed;
    }
}


