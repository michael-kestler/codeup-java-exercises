package grades;

import java.util.ArrayList;

public class Student {


    private String name;

    private Student (String name){
        this.name = name;
    }


    private ArrayList<Integer>  grades = new ArrayList<>();

    // returns the student's name
    public String getName() {
        return name;
    }

    // adds the given grade to the grades property
//    public addGrade(int grade){
//       return grades.add()
//    }
    // returns the average of the students grades
    public double getGradeAverage(){
        int sum = 0;
        for (int i: grades) {
            sum += i;
        }
        return sum/(grades.size());
    }





}
