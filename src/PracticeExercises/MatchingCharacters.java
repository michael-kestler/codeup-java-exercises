package PracticeExercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;



public class MatchingCharacters {
    public static void main(String[] args) {
        //get matching characterss in a string
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String text = scanner.nextLine();


        //creating hashmap chontaining char as a key and occurrences as a value
        HashMap<Character, Integer> mp = new HashMap<>();

//        Loop the string, character by character, and verify if that character
//        of the string exists in the hash map or not.
//        if the result is true, the counter for the character in the hash map
//        is increased or else then put a count as 1.
        for(int i = 0; i<text.length(); i++) {
            char ch = text.charAt(i);
            if(mp.containsKey(ch)){
                int count = mp.get(ch);
                mp.put(ch, ++count);
            } else {
                mp.put(ch, 1);
            }
        }

//        Once the loop ends, then the Hash map is traversed and print the characters
//        with more than 1 count.

        Set<Character> charct = mp.keySet();

        for(Character ch: charct){
            int c = mp.get(ch);
            if(c>1){
                System.out.println(ch + " - " + c);
            }
        }




    }
}
