package PracticeExercises;

import java.util.HashMap;
import java.util.Set;

public class MatchingCharacters {
    public static void main(String[] args) {
        //get matching characterss in a string
        HashMap<Character, Integer> mp = new HashMap<>();
        String text = null;
        
        for(int i = 0; i<text.length(); i++) {
            char ch = text.charAt(i);
            if(mp.containsKey(ch)){
                int count = mp.get(ch);
                mp.put(ch, ++count);
            } else {
                mp.put(ch, 1);
            }
        }
        
        Set<Character> charct = map.keySet();

        for(Character ch: charct){
            int c = mp.get(ch);
            if(c>1){
                System.out.println(ch + " - " + c);
            }
        }
    }
}
