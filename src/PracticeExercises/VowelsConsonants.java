package PracticeExercises;

import java.util.Locale;
import java.util.Scanner;

public class VowelsConsonants {
    // TODO: Calculate the number of vowels and consonants in a string

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //get the string on which the count has to be performed
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();

        //convert entire string to lower case to reduce number of comparsions
        str = str.toLowerCase();

        //counter variables to store count of vowels and consonants
        int vCount = 0, cCount=0;

        //run a loop from 0 to the length of the string
        //take a single character at a time and verify if they are a vowel
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
               //increments vowel counter
                vCount++;
            else
                //increments consonant counter
                cCount++;

        }
        System.out.println("Vowel count: " + vCount);
        System.out.println("Consonant count: " + cCount);

    }

}
