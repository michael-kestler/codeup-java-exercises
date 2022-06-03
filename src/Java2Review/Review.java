package Java2Review;

public class Review {


    // TODO: 1a. Make a class called review and create a public static method that takes in a double called radius,
//  so that you can find the circumference of a circle. (Circumference Equation: C = 2πr)
    public static double calcCircumference(double r) {
        return Math.PI * 2 * r;
    }

    // TODO: 1b. make the circumference method work with integers and doubles by using method overloading
    public static int calcCircumference(int r) {
        return (int) (Math.PI * 2 * r);
    }

    // TODO: Create a public static method called total with two double parameters named 'bill' and 'tipPercentage'.
// TODO: Return the final bill (double), including tip. (Equation: bill + ((tipPercentage / 100) * bill) = total)
    public static double total(double bill, double tipPercentage) {
        return bill + ((tipPercentage / 100 * bill));

    }

    // TODO: Create a public static method called even which takes in an int[] and souts out the even numbers
    public static int even(int[] num) {
        for (int j : num) {
            if (j % 2 == 0) {
                System.out.println(j);
            }

        }
        return 0;
    }

        public static void main (String[]args){
            double myRadius1 = calcCircumference(12.57);
            int myRadius2 = calcCircumference(5);

            int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            System.out.println(myRadius1);
            System.out.println(myRadius2);

            System.out.println(total(100, 15));

            System.out.println(even(intArray));
        }

    }
