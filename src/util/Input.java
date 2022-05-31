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
        while (true) {
            System.out.print("Enter a number between " + min + " and " + max + " :");
            if (scanner.nextInt() < min || scanner.nextInt() > max) {
                System.out.println("Invalid entry, Enter a number between " + min + " and " + max + " :");
                return scanner.nextInt();
            } else {
                break;
            }
        }
        return scanner.nextInt();
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







