package com.in28minutes.oops;

import org.w3c.dom.ls.LSOutput;

public class MyNumber {

    private int number;

    MyNumber(int number) {
        this.number = number;
    }

    public boolean isPrime() {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i < number - 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


    public int sumUptoN() {
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public int sumOfDivisors() {
        int sum = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public void printANumberTriangle() {
        //1
        //1 2
        //1 2 3
        //1 2 3 4
        //1 2 3 4 5
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

        }
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