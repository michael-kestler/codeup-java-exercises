package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);


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
        if (scanner.nextInt() >= min && scanner.nextInt() <= max) {
            return scanner.nextInt();
        } else {
            return min;
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


    }
}



