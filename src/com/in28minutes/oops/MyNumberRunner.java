package com.in28minutes.oops;

public class MyNumberRunner {
    public static void main(String[] args) {
        MyNumber number = new MyNumber(5);


        boolean isPrime = number.isPrime();
        System.out.println("isPrime " + isPrime);


        int sum = number.sumUptoN();
        System.out.println("sumUptoN " + sum);

        int sumOfDivisors = number.sumOfDivisors();
        System.out.println("sumOfDivisors " + sumOfDivisors);

        number.printANumberTriangle();




    }


}
