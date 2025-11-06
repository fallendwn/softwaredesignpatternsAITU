package ConcreteElement;

import Element.ISchoolElement;
import Visitor.ISchoolVisitor;


public class Teacher implements ISchoolElement{
    
    private String name;
    private float baseSalary;
    private int classesTaken;

    public Teacher(String name, float salary, int classesTaken){

        this.name = name;
        this.baseSalary = salary;
        this.classesTaken = classesTaken;

    }


    public String getName(){return this.name;}

    public void setName(String name){this.name = name;}

    public float getBaseSalary(){return this.baseSalary;}

    public void setBaseSalary(float newBaseSalary){this.baseSalary = newBaseSalary;}

    public int getClassesTaken(){return this.classesTaken;}

    public void increaseClassesTaken(int newClassesTaken){this.classesTaken++;}

    @Override
    public void accept(ISchoolVisitor visitor){

        visitor.visit(this);

    }
}
