import ConcreteElement.*;
import ConcreteVisitor.PayrollVisitor;
import ConcreteVisitor.StudentAverageVisitor;
import Element.ISchoolElement;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        Student alice = new Student("Alice", 14);
        alice.addGrade(85);
        alice.addGrade(92);
        alice.addGrade(79);

        Student bob = new Student("Bob", 15);
        bob.addGrade(60);
        bob.addGrade(70);

        Student charlie = new Student("Charlie", 14);

        Teacher mrIvanov = new Teacher("Mr. Ivanov", 200000, 18); 
        Teacher msPetrova = new Teacher("Ms. Petrova", 220000, 15);

        Classroom class101 = new Classroom(101);
        class101.addStudent(alice);
        class101.addStudent(bob);
        class101.addStudent(charlie);

        ArrayList<ISchoolElement> elements = new ArrayList<>();
        elements.add(alice);
        elements.add(bob);
        elements.add(charlie);
        elements.add(mrIvanov);
        elements.add(msPetrova);
        elements.add(class101);

        

        ArrayList<Student> students = new ArrayList<>();
        students.add(alice);
        students.add(bob);

        PayrollVisitor payrollVisitor = new PayrollVisitor();

        ConcreteVisitor.ReportCardVisitor reportCardVisitor = new ConcreteVisitor.ReportCardVisitor();

        for (ISchoolElement el : elements) {
            el.accept(payrollVisitor);
        }

        for (ISchoolElement el : elements) {
            el.accept(reportCardVisitor);
        }
        StudentAverageVisitor avgVisitor = new StudentAverageVisitor();

        for(int i = 0 ; i < 2; i ++){

            Student currentStudent = students.get(i);
            currentStudent.accept(avgVisitor);
            

        }
        class101.accept(reportCardVisitor);


    }
}
