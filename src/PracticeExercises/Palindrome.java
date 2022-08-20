package PracticeExercises;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String Str = scanner.nextLine();
//    char[] arr = Str.toCharArray();

        String rev = "";

        for(int i = Str.length() - 1; i >= 0; i -- ){
            rev = rev + Str.charAt(i);


        }
        if(Str.equalsIgnoreCase(rev))
            System.out.println(Str + " is a palindrome");
        else
            System.out.println(Str + " is not a palindrome");

    }
}


