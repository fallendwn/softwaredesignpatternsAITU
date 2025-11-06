package ConcreteVisitor;

import ConcreteElement.*;
import Visitor.ISchoolVisitor;
import java.util.ArrayList;


public class StudentAverageVisitor implements ISchoolVisitor {

    @Override
    public void visit(Teacher teacher){}

    @Override
    public void visit(Student student){
        ArrayList<Integer> grades = student.getGrades();
        float total = 0;
        int amountGrades = grades.size();
        for(int i = 0 ; i < amountGrades; i ++){

            total+=grades.get(i);

        }
        System.out.println(total/amountGrades );


    }

    @Override
    public void visit(Classroom classroom){}

}
