import ConcreteObserver.Principal;
import ConcreteSubject.Student;
import ConcreteSubject.Teacher;


public class Main{

    public static void main(String[] args){

        Principal principal = new Principal();

        Student student1 = new Student("Deniska", 15, 9);
        Student student2 = new Student("Oleg", 16, 10);

        Teacher teacher1 = new Teacher("Amangeldy Ruslanovich", 35);
        Teacher teacher2 = new Teacher("Svetlana Vladimirovna", 32);

        principal.attachStudent(student1);
        principal.attachStudent(student2);
        principal.attachTeacher(teacher1);
        principal.attachTeacher(teacher2);

        principal.attachStudent(teacher1);
        principal.attachTeacher(student1);

        principal.notifyStudents("Tomorrow is a holiday");

        principal.notifyTeachers("Please make СОЧ by Friday.");

        principal.notifyAll("School sadly will start at 9 AM on Monday.");


        principal.detachStudent(student1);

        principal.notifyStudents("Hello Oleg");

    }

}