package ConcreteVisitor;
import ConcreteElement.*;
import Visitor.ISchoolVisitor;

public class PayrollVisitor implements ISchoolVisitor {

    @Override
    public void visit(Teacher teacher){

        System.out.println("This month teacher: " + teacher.getName() + 
        " will be payed: " + (teacher.getBaseSalary() + 
        teacher.getClassesTaken() * 5000) + " tenge");

    }

    @Override
    public void visit(Student student){}

    @Override
    public void visit(Classroom classroom){}

}
