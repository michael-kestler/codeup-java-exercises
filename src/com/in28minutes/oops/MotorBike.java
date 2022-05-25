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

    MotorBike(){
        this(5);//no argument constructor - it calls the constructor below.
    }

    MotorBike(int speed){
        this.speed = speed;
    }//constructor


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed > 0)
        this.speed = speed;

    }

    public void increaseSpeed(int howMuch) {
        setSpeed(this.speed + howMuch);
    }

    public void decreaseSpeed(int howMuch) {
        setSpeed(this.speed - howMuch);
    }

    void start() {
        System.out.println("Bike Started");}

}
