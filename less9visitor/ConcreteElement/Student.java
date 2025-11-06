package ConcreteElement;

import Element.ISchoolElement;
import Visitor.ISchoolVisitor;
import java.util.ArrayList;

public class Student implements ISchoolElement {
    
    private String name;
    private final ArrayList<Integer> grades;
    private int age;
    public Student(String name, int age){

        this.name = name;
        this.grades = new ArrayList<>();
        this.age = age;

    }

    public void setName(String name){this.name = name;}

    public String getName(){return this.name;}

    public void incAge(){this.age++;}

    public int getAge(){return this.age;}

    public ArrayList<Integer> getGrades(){return this.grades;}

    public void addGrade(int grade){if(grade >=0 && grade<=100){grades.add(grade);} else{System.out.println("not correct grade");}}

    @Override
    public void accept(ISchoolVisitor visitor){

        visitor.visit(this);

    }

}
