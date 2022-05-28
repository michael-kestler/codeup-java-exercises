package com.in28minutes.oops;

import java.util.Scanner;

public class MenuRunner {
    public static void main(String[] args) {
        //Type obj = new Type (argument)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number1: ");
        int number1 = scanner.nextInt();
//        System.out.println("The number you entered is - " + number1);

//        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter Number2: ");
        int number2 = scanner.nextInt();
        System.out.println("1 - Add");
        System.out.println("2 - Subtract");
        System.out.println("3 - Divide");
//        Scanner scanner3 = new Scanner(System.in);
        System.out.println("4 - Multiply");
        System.out.println("Choose Operation: ");
        int chooseOperation = scanner.nextInt();

        switch(chooseOperation){
            case 1 : System.out.println("Result is - " + number1 + number2);
            break;
            case 2 : System.out.println("Result is - " + (number1 - number2));
            break;
            case 3 : System.out.println("Result is - " + number1 / number2);
            break;
            case 4 : System.out.println("Result is - " + number1 * number2);
            break;
            default: System.out.println("Invalid Operation");
        }

//        if (chooseOperation == 1){
//            System.out.println("Result is - " + number1 + number2);
//        } else if (chooseOperation == 2) {
//            System.out.println("Result is - " + (number1 - number2));
//        } else if (chooseOperation == 3) {
//            System.out.println("Result is - " + number1 / number2);
//        } else if (chooseOperation == 4) {
//            System.out.println("Result is - " + number1 * number2);
//        } else {
//            System.out.println("Invalid Operation");
//
//
//        }


    }


    }

