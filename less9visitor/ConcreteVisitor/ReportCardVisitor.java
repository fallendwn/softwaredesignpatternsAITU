package ConcreteVisitor;
import ConcreteElement.*;
import Visitor.ISchoolVisitor;
import java.util.ArrayList;
public class ReportCardVisitor implements ISchoolVisitor {

    @Override
    public void visit(Teacher teacher){}

    @Override
    public void visit(Student student){}

    @Override
    public void visit(Classroom classroom){
        ArrayList<Student> studentList = classroom.getStudentList();
        for(int i = 0 ; i < studentList .size(); i ++){

            Student currentStudent  = studentList.get(i);
            String gradesAsString = currentStudent.getGrades().toString();
            System.out.println(i + ". Student: " + currentStudent.getName() + " has grades " + gradesAsString);



        }

    }

}
