package com.in28minutes.oops;

public class MotorBikeRunner {

    public static void main(String[] args) {
        MotorBike ducati = new MotorBike(); //instance
        MotorBike honda  = new MotorBike(); //instance



        ducati.start(); //methods
        honda.start();

        ducati.setSpeed(100);
        System.out.println(ducati.getSpeed());

        honda.setSpeed(80);  //changing state of the object
        System.out.println(honda.getSpeed());



    }
}


//other classes should not be able to change methods of other classes because it breaks encapsulation all methods
// should pertain to that specific object

//when you make variable private annother class cannot access it