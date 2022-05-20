package com.in28minutes.oops;

public class BookRunner {
    public static void main (String[] args) {
        Book artOfComputerPrograming = new Book();
        Book effectiveJava = new Book();
        Book cleanCode = new Book();

        artOfComputerPrograming.noCopies(20);
        effectiveJava.noCopies(50);
        cleanCode.noCopies(45);
    }
}
