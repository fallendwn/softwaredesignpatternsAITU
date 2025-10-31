package ConcreteSubject;

import Subject.IAnnouncementListener;
import java.util.ArrayList;

public class Teacher implements IAnnouncementListener{
    
    private final String fullName;
    private final ArrayList<String> skills = new ArrayList<>();
    private int age;
    
    public Teacher(String fullName, int age){

        this.fullName = fullName;
        this.age = age;

    }


    @Override
    public void update(String message){

        System.out.println("Teacher " + fullName + " got message: " + message);

    }

    public String getFullName(){return this.fullName;}

    public int getAge(){return this.age;}

    public void setAge(int newAge){this.age = newAge;}

    public void addSkill(String newSkill){skills.add(newSkill);}

    public ArrayList<String> getSkills(){return this.skills;}

}
