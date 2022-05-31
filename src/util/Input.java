package util;

import java.util.Scanner;

public class Input {

    //create a private field named scanner
    private Scanner scanner = new Scanner(System.in);

    public Input(Scanner scanner) {
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
        while (true) {
            if (i > min && i < max) {
                System.out.println("Your number is " + i);

            } else if
            (i < min || i > max) {
                System.out.println("Invalid entry, Enter a number between " + min + " and " + max + " :");

            } else {
                break;
            }
        }
        {

        }
            return i;
    }
}


//    public boolean yesNo() {
//        return Objects.equals(scanner.nextLine(), "yes");
//    }

//    public void getInt(int min, int max) {
//        if (scanner.nextLine() >= min && scanner.nextLine() <= max) {
//            return scanner.nextLine();
//        }
//
//       public int getInt () {
//
//        }
//
//        public double getDouble ( double min, double max){
//
//        }
//
//        public double getDouble () {
//
//        }
//







