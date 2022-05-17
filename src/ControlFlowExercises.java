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

        for(int i = 1; i <= 100; i++){
            if(((i % 3) == 0) && ((i % 5) == 0)) //Is it a multiple of 3 & 5
                System.out.println("FizzBuzz");
            else if ((i % 3) == 0) // is it a multiple of 3
                System.out.println("Fizz");
            else if ((i % 5) == 0) //is it a multiple of 5
                System.out.println("Buzz");
            else
                System.out.println(i); //not a multiple of 3 or 5

        }


    }
}