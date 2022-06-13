import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers); //printout shows memory location.
        // need to convert to string in order to display
        // the result

        //create an array that holds 3 Person objects

        Person[] person1 = new Person[3];
        person1[0] = new Person("Ricky Bobby");
        person1[1] = new Person("Cal Norton Jr");
        person1[2] = new Person("Jean Girard");
        for (Person s : person1) {
            System.out.println(s);
        }

        Person[] person2 = new Person[1];
        person2[0] = new Person("Linda Lovelace");

        System.out.println(addPerson(person1, person2[0]));

        }

    public static String addPerson(Person[] person, Person newPerson) {
        person = Arrays.copyOf(person, person.length + 1);
        person[person.length - 1] = newPerson;
        return Arrays.toString(person);
    }

    }






