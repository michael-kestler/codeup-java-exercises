package com.in28minutes.oops;

public class MyChar {


    private char ch;

    MyChar(char ch) {
        this.ch = ch;
    }


    public boolean isVowel() {
        //a e i o u or A E I O U
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return true;

        } return false;
        }


//    public boolean isConsonant() {
//    }

    public boolean isDigit() {
        if(ch >= 48 && ch <=57){
            return true;
        } return false;

    }

    public boolean isAlphabet() {
       if (ch >= 97 && ch <= 122){
           return true;
       } if (ch >= 65 && ch <= 90){
           return true;
        } return false;
    }

    public boolean isConsonant(){
        if (isVowel() == false && isDigit() == false){
            return true;
        } return false;
    }
}




