package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Student> students = new HashMap<>();
        Student student1 = new Student("Richie");
        Student student2 = new Student("Alfalfa");
        Student student3 = new Student("Bart");
        Student student4 = new Student("Stewie");
        student1.addGrade(95);
        student1.addGrade(76);
        student1.addGrade(89);

        student2.addGrade(88);
        student2.addGrade(77);
        student2.addGrade(99);

        student3.addGrade(95);
        student3.addGrade(96);
        student3.addGrade(99);

        student4.addGrade(100);
        student4.addGrade(85);
        student4.addGrade(95);


        students.put("richierich", student1);
        students.put("ourgangog", student2);
        students.put("cowabunga78", student3);
        students.put("oedipusrex69", student4);


        String goAgain;
        do {
            System.out.println("Welcome!");

            System.out.println("Here are the GitHub usernames of our students" + students.keySet());

            System.out.println("What student would you like to see more information on?");

            String userName = scanner.nextLine();

            if (students.containsKey(userName)) {
                System.out.println("Name: " + students.get(userName).getName()
                        + " " + students.get(userName).getGradeAverage());
            }

            System.out.print("Would you like to see another student? [y/N] ");
            goAgain = scanner.next();
            {


            }


        } while (goAgain.equals("y"));
    }
}
