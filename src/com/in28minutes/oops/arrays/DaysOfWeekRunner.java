package com.in28minutes.oops.arrays;

import java.util.Arrays;
import java.util.Collections;

public class DaysOfWeekRunner {

    public static void main(String[] args) {
        String daysList[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        System.out.println(getLongestString(daysList));

//        System.out.println(reverseArr(daysList));
    }


    public static String getLongestString(String[] arr) {
        int index = 0;
        int elementLength = arr[0].length();

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() > elementLength) {
                index = i;
                elementLength = arr[i].length();


            }


        }
        return arr[index];
    }

//    public static void String reverseArr(String[] arr){
//
//        String ArrReverse[] = Collections.reverse(Arrays.asList(arr));
//
//        return arr[];
//    }

    }
