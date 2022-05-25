package com.in28minutes.oops;

public class MotorBikeRunner {

    public static void main(String[] args) {
        MotorBike ducati = new MotorBike(100); //instance
        MotorBike honda  = new MotorBike(200); //instance
        MotorBike harleyDavidson = new MotorBike();



        ducati.start(); //methods
        honda.start();

//        ducati.setSpeed(100);
//
//        ducati.increaseSpeed(100);
//        ducati.decreaseSpeed(50);
//
//        honda.increaseSpeed(100);
//        honda.decreaseSpeed(50);


//        int ducatiSpeed = ducati.getSpeed();//get speed
//        ducatiSpeed = ducatiSpeed + 100;//increase it by 100
//        ducati.setSpeed(ducatiSpeed);//set it to ducati
//
//        int hondaSpeed = honda.getSpeed();//get speed
//        hondaSpeed = hondaSpeed + 100;//increase it by 100
//        honda.setSpeed(hondaSpeed);//set it to ducat

        System.out.println(ducati.getSpeed());
        System.out.println(honda.getSpeed());
        System.out.println(harleyDavidson.getSpeed());
    }
}


//other classes should not be able to change methods of other classes because it breaks encapsulation all methods
// should pertain to that specific object

//when you make variable private annother class cannot access it