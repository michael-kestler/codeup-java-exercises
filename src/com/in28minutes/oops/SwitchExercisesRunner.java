package com.in28minutes.oops;

import java.util.Scanner;

public class SwitchExercisesRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(isWeekday(0));
        System.out.println(determineNameOfMonth(12));
        System.out.println(determineNameOfDay(5));
    }

    public static boolean isWeekday(int dayNumber) {
        switch (dayNumber) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
        }
        return false;
    }

    public static String determineNameOfMonth(int monthNumber) {
         switch (monthNumber) {
            case 1:
               return "January";

            case 2:
               return "February";

            case 3:
                return "March";

            case 4:
                return "April";

            case 5:
                return "May";

            case 6:
                return "June";

            case 7:
                return "July";

            case 8:
                return "August";

            case 9:
                return "September";

            case 10:
                return "October";

            case 11:
                return "November";

            case 12:
                return "December";

            default:
                return "Invalid Operation";

        }

    }
    public static String determineNameOfDay(int dayNumber){
        String result = "";
        switch(dayNumber){
            case 0: result = "Sunday";
            break;
            case 1: result = "Monday";
            break;
            case 2: result = "Tuesday";
            break;
            case 3: result = "Wednesday";
            break;
            case 4: result = "Thursday";
            break;
            case 5: result = "Friday";
            break;
            case 6: result = "Saturday";
            break;
            default: result = "Invalid Operation";
        }
        return result;
    }


}





