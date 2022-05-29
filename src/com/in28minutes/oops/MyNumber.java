package com.in28minutes.oops;

import org.w3c.dom.ls.LSOutput;

public class MyNumber {

    private int number;

    MyNumber(int number) {
        this.number = number;
    }

    public boolean isPrime() {
        if(number<2){
            return false;
        }

        for (int i = 2; i < number - 1; i++){
            if (number % i == 0){
                return false;


            }
        }
        return true;
    }
}

//2 to number -1
//how can I check if a number is divisible by 2

//    public boolean isPrime() {
//        for (int i = 2; i <= num / 2; i++) {
//            //condition for non-prime number
//            if (num % i == 0) {
//                return false;
//                break;
//            }
//
//    }
//}