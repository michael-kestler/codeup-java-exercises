import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//    int i = 5;
//    while (i <= 15) {
//        System.out.println("i is " + i);
//        i++;
//    }
//        int i = 0;
//        do {
//            System.out.println(i);
//            i+=2;
//        } while (i <= 100 );
//            int i = 100;
//            do {
//                System.out.println(i);
//                i-=5;
//            }while (i<=100 && i >= -10);

//            long i = 2;
//            do {
//                System.out.println(i);
//                i*=i;
//            }while(i<=1000000);

        //print by 5 backwards from 100 to -10
//        for(int i = 100; i<=100 && i>=-10; i-=5){
//            System.out.println(i);
//        }

        //print squares of 2 less than 1,000,000
//        for(long i = 2; i<=1000000; i*=i){
//            System.out.println(i);
//        }

        //fizzbuzz exercise

//        for(int i = 1; i <= 100; i++){
//            if(((i % 3) == 0) && ((i % 5) == 0)) //Is it a multiple of 3 & 5
//                System.out.println("FizzBuzz");
//            else if ((i % 3) == 0) // is it a multiple of 3
//                System.out.println("Fizz");
//            else if ((i % 5) == 0) //is it a multiple of 5
//                System.out.println("Buzz");
//            else
//                System.out.println(i); //not a multiple of 3 or 5
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter an integer: ");
//        int userInput = sc.nextInt();
//
//        System.out.println("number | " + " " + "squared | " + " " + "cubed |");
//        System.out.println(" ------"    + " " + "   ------- "    + " " + "------");
//
//        for(int i = 1; i <=userInput; i++){
////            i = userInput;
//            int numberSquared = (int) Math.pow(i, 2);
//            int numberCubed = (int) Math.pow(i, 3);
//
//            String message = "\n" + i +"    |     " + numberSquared  + "  |         " + numberCubed + " |";
//
//            System.out.println(message);
//            System.out.println();
//        }

    while (true) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numerical grade");
        int userInput = sc.nextInt();


        switch ((88 <= userInput && userInput <= 100) ? 0 :
                (80 <= userInput && userInput <= 87) ? 1 :
                        (70 <= userInput && userInput <= 79) ? 2 :
                                (60 <= userInput && userInput <= 67) ? 3 : 4) {
            case 0:
                System.out.println("Your grade is A");
                break;
            case 1:
                System.out.println("Your grade is B");
                break;
            case 2:
                System.out.println("Your grade is C");
                break;
            case 3:
                System.out.println("Your grade is D");
                break;
            case 4:
                System.out.println("You got an F loser");
                break;
            case 5:
        }
        System.out.print("Continue? [y/N] ");
        String goAgain = sc.next();
        if (!goAgain.equals("y")) {
            break;
        }
    }
    }
}