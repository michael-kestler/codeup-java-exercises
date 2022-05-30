package com.in28minutes.oops;

public class MotorBike {

    //MotorBike is acting as a template
    //objects have
    //state
    private int speed; //instance variable - state of an object - state can change
    //state changes happen through methods below and methods are called the behavior of the object
    //when designing class we need to decide "what is the state?
    //what are the constructors?
    //what is the behavior? what methods do you need to act on the state?

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
