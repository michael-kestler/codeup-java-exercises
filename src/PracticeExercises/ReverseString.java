package PracticeExercises;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        //Reverse a String

        String str = "Groovy";
        String rstr = "";
        char ch;

        System.out.println("Original word: " + str);


        for (int i=0; i<str.length(); i++) {
            ch = str.charAt(i); //extracts each character
            rstr = ch + rstr; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: " + rstr);



    //Reversing string based on user input
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a word: ");
    String Str = scanner.nextLine();
//    char[] arr = Str.toCharArray();

    String rev = "";

    for(int i = Str.length() - 1; i >= 0; i -- ){
    rev = rev + Str.charAt(i);
    }
        System.out.println(rev);

    }



}
