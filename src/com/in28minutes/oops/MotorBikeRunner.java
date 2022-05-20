package com.in28minutes.oops;

public class MotorBikeRunner {

    public static void main(String[] args) {
        MotorBike ducati = new MotorBike(); //instance
        MotorBike honda  = new MotorBike(); //instance



        ducati.start(); //methods
        honda.start();

        ducati.setSpeed(100);
        honda.setSpeed(80);  //changing state of the object

        ducati.setSpeed(20);
        honda.setSpeed(0);  //state of any object can keep changing

    }
}


//other classes should not be able to change methods of other classes because it breaks encapsulation all methods
// should pertain to that specific object

//when you make variable private annother class cannot access it