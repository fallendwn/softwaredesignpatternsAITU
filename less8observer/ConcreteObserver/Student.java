package ConcreteObserver;

import Observer.IAnnouncementListener;

public class Student implements IAnnouncementListener{

    private final String fullName;
    private int age;
    private int grade;

    public Student(String fullName, int age, int grade){

        this.fullName = fullName;
        this.age = age;
        this.grade = grade;

    }

    @Override
    public void update(String message){

        System.out.println("Student " + fullName + " got message: " + message);

    }

    public void setAge(int newAge){this.age = newAge;}

    public int getAge(){return this.age;}

    public void setGrade(int newGrade){this.grade = newGrade;}

    public int getGrade(){return this.grade;}

    public String getFullName(){return this.fullName;}


}
