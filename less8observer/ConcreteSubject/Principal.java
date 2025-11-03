package ConcreteSubject;



import ConcreteObserver.Teacher;
import Observer.IAnnouncementListener;
import Subject.ISchoolAnnouncementBoard;
import java.util.ArrayList;


public class Principal implements  ISchoolAnnouncementBoard{

    ArrayList<IAnnouncementListener> attachedStudents = new ArrayList<>();
    ArrayList<IAnnouncementListener> attachedTeachers = new ArrayList<>();


    @Override
    public void attach(IAnnouncementListener person){

        if (person instanceof Teacher){attachedTeachers.add(person);}
        else{attachedStudents.add(person);}

    }
    
    @Override
    public void detach(IAnnouncementListener person){

        if (person instanceof Teacher){attachedTeachers.remove(person);}
        else{attachedStudents.remove(person);}

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
