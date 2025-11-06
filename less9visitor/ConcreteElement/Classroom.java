package ConcreteElement;

import Element.ISchoolElement;
import Visitor.ISchoolVisitor;
import java.util.ArrayList;

public class Classroom implements ISchoolElement{
    
    private final ArrayList<Student> studentList;
    private int classNumber;

    public Classroom(int classNumber){

        this.studentList = new ArrayList<>();
        this.classNumber = classNumber;

    }


    public void setClassNumber(int newClassNumber){this.classNumber = newClassNumber;}

    public int getClassNumber(){return this.classNumber;};

    public void addStudent(Student student){studentList.add(student);}

    public void removeStudent(Student student){studentList.remove(student);}

    public ArrayList<Student> getStudentList(){return this.studentList;}

    @Override
    public void accept(ISchoolVisitor visitor){

        visitor.visit(this);

    }

}
