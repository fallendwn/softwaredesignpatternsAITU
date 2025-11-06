import ConcreteObserver.Student;
import ConcreteObserver.Teacher;
import ConcreteSubject.Principal;


public class Main{

    public static void main(String[] args){

        Principal principal = new Principal();

        Student student1 = new Student("Deniska Li", 15, 9);
        Student student2 = new Student("Oleg Valyerevich", 16, 10);

        Teacher teacher1 = new Teacher("Amangeldy Ruslanovich", 35);
        Teacher teacher2 = new Teacher("Svetlana Vladimirovna", 32);

        principal.attach(student1);
        principal.attach(student2);
        principal.attach(teacher1);
        principal.attach(teacher2);



        // principal.notifyStudents("Tomorrow is a holiday");

        // principal.notifyTeachers("Please make СОЧ by Friday.");

        // principal.notifyAll("School sadly will start at 9 AM on Monday.");


        // principal.detach(student1);

        principal.notifyStudents("Hello Oleg");

    }

}