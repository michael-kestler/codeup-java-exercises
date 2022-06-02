package com.in28minutes.oops;

import java.math.BigDecimal;

public class StudentRunner {
    public static void main(String[] args) {

        int[] grades = {97, 98, 100};
        Student student = new Student ("Spanky", grades);

    int number = student.getNumberOfGrades();
        System.out.println("number of grades is " + number);

    int sum = student.getTotalSumOfGrades();
        System.out.println("sum of grades is " + sum);


        int maximumMark = student.getMaximumGrade();
        System.out.println("highest grade is " + maximumMark);

        int minimumMark = student.getMinimumGrade();
        System.out.println("lowest grade is " + minimumMark);


        BigDecimal average = student.getAverageGrades();
        System.out.println("average is " + average);
    }
}
