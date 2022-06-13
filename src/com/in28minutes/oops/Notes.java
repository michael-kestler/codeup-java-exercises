package com.in28minutes.oops;

import org.w3c.dom.ls.LSOutput;

import java.util.Iterator;
import java.util.List;

public class Notes {
    public static void main(String[] args) {
        List<String> words = List.of("Apple", "Bat", "Cat");

        for(int i= 0; i < words.size(); i++){
            System.out.println(words.get(i));
        }

        for(String word:words) {
            System.out.println(word);
        }

        Iterator wordsIterator = words.iterator();

        while(wordsIterator.hasNext()) {
            System.out.println(wordsIterator.next());
        }

    }




}
