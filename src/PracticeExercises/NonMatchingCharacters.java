package PracticeExercises;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class NonMatchingCharacters {

    // TODO: Get the non-matching characters in a string

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String text = scanner.nextLine();

        //Hash Map data structure is taken which works with the key
        //value pair

        HashMap<Character, Integer> mp = new HashMap<>();

        //loop the string character by character, and verify if that character exists in the
        //hash map or not
        //if the result is true the counter for the character in the hashmap is increased or
        //else put a count of 1
        for(int i = 0; i<text.length(); i++) {
            char ch = text.charAt(i);
            if (mp.containsKey(ch)) {
                int count = mp.get(ch);
                mp.put(ch, ++count);
            } else {
                mp.put(ch, 1);
            }
        }

        //once loop ends, then Hash Map is traversed and print the characters with count equal to 1
        //example when 'remember' is input 'b-1' is what is printed

            Set<Character> charct = mp.keySet();
            for (Character ch: charct){
                int c= mp.get(ch);
                if(c==1){
                    System.out.println(ch + " - " + c);
                }
            }

    }



}
