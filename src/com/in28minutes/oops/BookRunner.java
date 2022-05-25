package com.in28minutes.oops;

public class BookRunner {
    public static void main (String[] args) {
        Book artOfComputerPrograming = new Book(1000);
        Book effectiveJava = new Book(1000);
        Book cleanCode = new Book(1000);

//        artOfComputerPrograming.setNoCopies(20);
//        effectiveJava.setNoCopies(50);
//        cleanCode.setNoCopies(45);
//
//        artOfComputerPrograming.increaseNoCopies(250);
//
//        effectiveJava.decreaseNoCopies(15);
//
//        cleanCode.decreaseNoCopies(25);

        System.out.println(artOfComputerPrograming.getNoCopies());
        System.out.println(effectiveJava.getNoCopies());
        System.out.println(cleanCode.getNoCopies());
    }
}
