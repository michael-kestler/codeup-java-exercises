package grades;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Jenny");
        Student student2 = new Student("Heather");


        student1.addGrade(75);
        student1.addGrade(85);
        student1.addGrade(95);
        student1.addGrade(70);
        student2.addGrade(100);
        student2.addGrade(95);
        student2.addGrade(90);

        System.out.println((student1.getName() + " has an average of "
                + student1.getGradeAverage()));

        System.out.println((student2.getName() + " has an average of "
                + student2.getGradeAverage()));



    }
}
