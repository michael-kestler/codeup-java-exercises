package util;

import java.util.Scanner;

public class Input {

    //create a private field named scanner
    private Scanner scanner = new Scanner(System.in);

    public Input() {
        this.scanner = scanner;
    }

    public String getString() {
        System.out.print("Enter data: ");
        return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.print("Enter yes or no: ");
        if (scanner.nextLine().equals("yes")) {
            return true;
        } else {
            return false;
        }
    }


    public int getInt(int min, int max) {
        System.out.print("Enter a number between " + min + " and " + max + " :");
        int i = scanner.nextInt();

            while (i < min || i > max) {
                    System.out.println("Invalid entry, Enter a number between " + min + " and " + max + " :");
                    i = scanner.nextInt();
            }  System.out.println("Your number is " + i);
            return i;
    }


    public double getDouble(double min, double max) {
        System.out.print("Enter a decimal number between " + min + " and " + max + " :");
        double i = scanner.nextDouble();

        while (i < min || i > max) {
            System.out.println("Invalid entry, Enter a decimal number between " + min + " and " + max + " :");
            i = scanner.nextDouble();
        }  System.out.println("Your number is " + i);
        return i;
    }

    public double getDouble() {
        System.out.print("Enter decimal: ");
        return scanner.nextDouble();

    }
}




//        public double getDouble ( double min, double max){
//
//        }
//
//        public double getDouble () {
//
//        }
//







