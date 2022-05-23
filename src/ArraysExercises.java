public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers); //printout shows memory location.
        // need to convert to string in order to display
        // the result

        //create an array that holds 3 Person objects

        String[] person;

        person = new String[3];

        person[0] = "Ricky Bobby";
        person[1] = "Cal Norton Jr";
        person[2] = "Jean Girard";

        for (int i = 0; i < person.length; i += 1) {
            System.out.println(person[i]);


        }

    }
    public static void addPerson (Integer[] intArray){


    }

}
