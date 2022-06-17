package PracticeExercises;

public class Warmup {
//    The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
//    We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }



//    Given an array of ints, return true if 6 appears as either
//    the first or last element in the array. The array will be length 1 or more.
public boolean firstLast6(int[] nums) {

    return nums[0] == 6 || nums[nums.length - 1] == 6;

}




    public static void main(String[] args) {

    }

    }

