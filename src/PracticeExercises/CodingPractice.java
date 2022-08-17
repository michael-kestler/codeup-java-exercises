package PracticeExercises;

public class CodingPractice {

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

    }

    //Reversing string based on user input




}
