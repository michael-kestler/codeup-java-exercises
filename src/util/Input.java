package util;

import java.util.Scanner;

public class Input {


    //create a private field named scanner
    private static Scanner scanner = new Scanner(System.in);

    public Input() {
        this.scanner = scanner;
    }

    public static String getString() {
        System.out.print("Enter number: ");
        return scanner.nextLine();

    }


//    public boolean yesNo() {
//        System.out.print("Enter yes or no: ");
//        if (scanner.nextLine().equals("yes")) {
//            return true;
//        } else {
//            return false;
//        }
//    }

    public static int getInt(int min, int max) {
        System.out.print("Enter a number between " + min + " and " + max + " :");
        int i = Integer.parseInt(getString());


        while (i < min || i > max) {
            System.out.println("Invalid entry, Enter a number between " + min + " and " + max + " :");
            i = Integer.parseInt(getString());
        }
        System.out.println("Goodbye");
        return 0;
    }

//exceptions and error handling
//    public static int getInt(int min, int max){
//        int i = 1;
//        do{
//            System.out.print("Enter a number between " + min + " and " + max + " :");
//            String s = getString();
//
//            try{
//                i = Integer.parseInt(s);
//            } catch (NumberFormatException nfe) {
//                System.out.println(nfe.getMessage() + " is not an integer");
//                getInt(min, max);
//            } catch (Exception e) {
//                System.out.println(e.getMessage() + " is not a valid input");
//                getInt(min, max);
//            }
//        }  while(i < min || i > max);
//        return i;

//
//    }


//    public int getInt(int min, int max) {
//        System.out.print("Enter a number between " + min + " and " + max + " :");
//        int i = scanner.nextInt();
//
//
//            while (i < min || i > max) {
//                    System.out.println("Invalid entry, Enter a number between " + min + " and " + max + " :");
//                    i = scanner.nextInt();
//            }  System.out.println("Your number is " + i);
//            return i;
//    }


//    public double getDouble(double min, double max) {
////        System.out.print("Enter a decimal number between " + min + " and " + max + " :");
//        double i = Double.parseDouble(getString());
//
//        while (i < min || i > max) {
////            System.out.println("Invalid entry, Enter a decimal number between " + min + " and " + max + " :");
//            i = Double.parseDouble(getString());
//        }
//        System.out.println("Your number is " + i);
//        return i;
//    }

    public double getDouble(double min, double max) {
        double i = 1.0;
        do {
            System.out.print("Enter a decimal number between " + min + " and " + max + " :");
            String s = getString();

            try {
                i = Integer.parseInt(s);
            } catch (NumberFormatException nfe) {
                System.out.println(nfe.getMessage() + " is not a decimal number");
                getDouble(min, max);
            } catch (Exception e) {
                System.out.println(e.getMessage() + " is not a valid input");
                getDouble(min, max);
            }
        } while (i < min || i > max);
        return i;


    }
}








//    public double getDouble() {
//        System.out.print("Enter decimal: ");
//        return scanner.nextDouble();
//
//    }
//}




//
//    public double getDouble(double min, double max) {
//        System.out.print("Enter a decimal number between " + min + " and " + max + " :");
//        double i = scanner.nextDouble();
//
//        while (i < min || i > max) {
//            System.out.println("Invalid entry, Enter a decimal number between " + min + " and " + max + " :");
//            i = scanner.nextDouble();
//        }  System.out.println("Your number is " + i);
//        return i;
//    }
//
//    public double getDouble() {
//        System.out.print("Enter decimal: ");
//        return scanner.nextDouble();
//
//    }
//}




//        public double getDouble ( double min, double max){
//
//        }
//
//        public double getDouble () {
//
//        }
//







