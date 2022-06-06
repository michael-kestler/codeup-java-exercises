import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers); //printout shows memory location.
        // need to convert to string in order to display
        // the result

        //create an array that holds 3 Person objects




//        String[] person;
//
//        person = new String[3];
//
//        person[0] = "Ricky Bobby";
//        person[1] = "Cal Norton Jr";
//        person[2] = "Jean Girard";
//
//        for (String s : person) {
//            System.out.println(s);
//        }







        int[] marks  = {100, 99, 95, 96, 100};
        //enhanced for loop is same as the for loop with variable i
        for(int mark : marks){
            System.out.println(mark);

            for(int i = 0; i<marks.length; i++){
                System.out.println(marks[i]);
            }
        }

        int[] grades = new int[5];
        Arrays.fill(grades, 100);
        System.out.println(Arrays.toString(grades));

        int[] array1 = {1, 2, 3};

        int[] array2 = {1, 2, 3};
        System.out.println(Arrays.toString(array2));

//        Arrays.equals(array1, array2); - does not work. don't use.





        }


//       public static void addPerson(String [] Person, String [] newPerson){
//            String [] copyFrom = Person;
//            String [] copyTo = newPerson;
//           System.out.println(addPerson(["Joe, John, James"]), ["Jerry"];);
//        }
//


//    public static arraycopy void addPerson(
//
//    String [] args) {
//        String [] arr1 = new String[3];
//        String [] arr2 = new String [1];
//        String [] copyFrom = arr1;
//
//        String [] copyTo = arr2;
//
//        System.out.print(addPerson[]);






}




