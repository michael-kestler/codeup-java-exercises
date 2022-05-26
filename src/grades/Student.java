package grades;

import java.util.ArrayList;

public class Student {


    private String name;

    private Student (String name){
        this.name = name;
    }


    ArrayList<Integer>  grades = new ArrayList<>();

    // returns the student's name
    public String getName() {
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade){
        return grades;
    }
    // returns the average of the students grades
    public double getGradeAverage(){
        return grades/grades.size;
    }




}
