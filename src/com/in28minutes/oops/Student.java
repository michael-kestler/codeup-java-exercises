package com.in28minutes.oops;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {

    private String name;
    private int[] grades;

    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
    }

    public int getNumberOfGrades() {
        return grades.length;
    }

    public int getTotalSumOfGrades() {
        int sum = 0;
        for(int grade:grades) {
            sum += grade;
        }
        return sum;
    }

    public int getMaximumGrade() {
        int maximum = Integer.MIN_VALUE; //95, 98, 100
        for(int grade:grades) {
            if(grade>maximum){
                maximum = grade;
            }
        }
        return maximum;
    }

    public int getMinimumGrade() {
        int minimum = Integer.MAX_VALUE; //95, 98, 100
        for(int grade:grades) {
            if(grade<minimum){
                minimum = grade;
            }
        }
        return minimum;
    }



    public BigDecimal getAverageGrades() {
        int sum = getTotalSumOfGrades();
        int number = getNumberOfGrades();
        //total
        return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
        //precision and rounding mode
    }
}

