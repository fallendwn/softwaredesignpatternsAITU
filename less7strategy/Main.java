
import ConcreteStrategy.*;
import Context.*;

public class Main{

    public static void main(String[] args){
        OfflineLearning offlineLearning = new OfflineLearning();
        PersonalLearning personalLearning = new PersonalLearning();
        OnlineLearning onlineLearning  = new OnlineLearning();

        SchoolStudent schoolStudent = new SchoolStudent(offlineLearning);
        UniversityStudent universityStudent = new UniversityStudent(offlineLearning);

        System.out.println(schoolStudent.performTask() + " - school student");
        System.out.println(universityStudent.performTask() + " - university student");

        schoolStudent.setLearnStrategy(personalLearning);
        universityStudent.setLearnStrategy(personalLearning);
        System.out.println(schoolStudent.performTask() + " - school student");
        System.out.println(universityStudent.performTask() + " - university student");

        universityStudent.setLearnStrategy(onlineLearning);
        schoolStudent.setLearnStrategy(onlineLearning);
        System.out.println(schoolStudent.performTask() + " - school student");
        System.out.println(universityStudent.performTask() + " - university student");

        personalLearning.setLearnType("I'm studying with personal teacher and also go offline");
        
        schoolStudent.setLearnStrategy(personalLearning);
        universityStudent.setLearnStrategy(personalLearning);
        System.out.println(schoolStudent.performTask() + " - school student");
        System.out.println(universityStudent.performTask() + " - university student");

    }

}