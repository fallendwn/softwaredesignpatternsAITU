package ConcreteObserver;

import ConcreteSubject.Student;
import ConcreteSubject.Teacher;
import Observer.ISchoolAnnouncementBoard;
import Subject.IAnnouncementListener;
import java.util.ArrayList;


public class Principal implements  ISchoolAnnouncementBoard{

    ArrayList<IAnnouncementListener> attachedStudents = new ArrayList<>();
    ArrayList<IAnnouncementListener> attachedTeachers = new ArrayList<>();


    @Override
    public void attachStudent(IAnnouncementListener student){
        if(student instanceof Student){attachedStudents.add(student);}
        else{System.out.println("You tried to attach teacher to a student.");}
    }
    
    @Override
    public void detachStudent(IAnnouncementListener student){
        if(attachedStudents.contains(student)){attachedStudents.remove(attachedStudents.indexOf(student));}
        else{System.out.println("You tried to detach non-existent student");}
    }

    @Override
    public void attachTeacher(IAnnouncementListener teacher){
        if (teacher instanceof Teacher){attachedTeachers.add(teacher);}
        else{System.out.println("You tried to attach student to a teacher.");}
    }
    
    @Override
    public void detachTeacher(IAnnouncementListener teacher){
        if(attachedTeachers.contains(teacher)){attachedTeachers.remove(attachedTeachers.indexOf(teacher));}
        else{System.out.println("You tried to detach non-existent teacher");}
    }

    @Override
    public void notifyTeachers(String message){

        for(IAnnouncementListener teacher : attachedTeachers){

            teacher.update(message);

        }

    }

    @Override
    public void notifyStudents(String message){

        for(IAnnouncementListener student : attachedStudents){

            student.update(message);

        }

    }

    @Override
    public void notifyAll(String message){

        notifyStudents(message);
        notifyTeachers(message);

    }


}
