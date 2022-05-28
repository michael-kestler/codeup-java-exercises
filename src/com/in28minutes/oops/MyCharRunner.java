package com.in28minutes.oops;

public class MyCharRunner {
    public static void main(String[] args) {
        MyChar myChar = new MyChar('M');
        //'a', 'e', 'i', 'o', 'u', and Capitals
        System.out.println(myChar.isVowel());
        System.out.println(myChar.isConsonant());;
        System.out.println(myChar.isDigit());
        System.out.println(myChar.isAlphabet());

        MyChar.printLowerCaseAlphabets();
        MyChar.printUpperCaseAlphabets();
    }
}
