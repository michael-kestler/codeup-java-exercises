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

        HashMap<Character, Integer> mp = new HashMap<>();
        for(int i = 0; i<text.length(); i++) {
            char ch = text.charAt(i);
            if (mp.containsKey(ch)) {
                int count = mp.get(ch);
                mp.put(ch, ++count);
            } else {
                mp.put(ch, 1);
            }
        }
            Set<Character> charct = mp.keySet();
            for (Character ch: charct){
                int c= mp.get(ch);
                if(c==1){
                    System.out.println(ch + " - " + c);
                }
            }





    }



}
