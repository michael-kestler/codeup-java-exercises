package hackerRankExercises;

import java.util.Scanner;

public class Solution {

        public static void main(String[] args) {
            // Create a Scanner object to read input from stdin.
            Scanner scan = new Scanner(System.in);

            // Read a full line of input from stdin and save it to our variable, inputString.
            System.out.println("Give me input: ");
            String inputString = scan.nextLine();

            // Close the scanner object, because we've finished reading
            // all of the input from stdin needed for this challenge.
            scan.close();

            // Print a string literal saying "Hello, World." to stdout.
            System.out.println("Hello, World.");

            // TODO: Write a line of code here that prints the contents of inputString to stdout.

            System.out.println(inputString);


            double d1;
            double d2;

            d1 = 7.22;
            d2 = 3.14;

            System.out.println(Math.floor(d1 + d2));


            System.out.println(String.format("%.1f", d1+d2));

        }
    }


