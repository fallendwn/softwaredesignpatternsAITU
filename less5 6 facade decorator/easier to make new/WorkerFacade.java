import java.util.ArrayList;

public class WorkerFacade {

    ISchoolWorker teacher = new ConcreteTeacher();
    ISchoolWorker director = new ConcreteDirector();

    ArrayList<ISchoolWorker> teachersList = new ArrayList<>();
    ArrayList<ISchoolWorker> directorsList = new ArrayList<>();

    //getters setters zone 

    //create new teacher and director
    // + push the existed one in the array;

    public void addCurrentTeacher(){

        teachersList.add(teacher);

    }
    public void addCurrentDirector(){

        directorsList.add(director);

    }
    
    public void createNewTeacher(){

        addCurrentTeacher();

        teacher = new ConcreteTeacher();

    }

    public void createNewDirector(){

        addCurrentDirector();

        director = new ConcreteDirector();

    }

    public void outputAllTeachers(){

        if (teachersList.isEmpty()){

            System.out.println("no teachers!");

        }
        else{

            for(int i = 0 ; i < teachersList.size();i++){

                System.out.println(teachersList.get(i).getName() + "|" + teachersList.get(i).getAge() + "|" + teachersList.get(i).getSubject());

            }

        }

    }

    public void outputAllDirectors(){

        if (directorsList.isEmpty()){

            System.out.println("no directors!");

        }
        else{

            for(int i = 0 ; i < directorsList.size();i++){

                System.out.println(directorsList.get(i).getName() + "|" + directorsList.get(i).getAge() + "|" + directorsList.get(i).getSubject());

            }

        }

    }

    public void setTeacherName(String newName){

        ((ConcreteTeacher) teacher).setName(newName);

    }

    public void setTeacherAge(int newAge){

        ((ConcreteTeacher) teacher).setAge(newAge);

    }

    public void setTeacherSubject(String newSubject){

        ((ConcreteTeacher) teacher).setSubject(newSubject);

    }

    public void setDirectorName(String newName){

        ((ConcreteDirector) director).setName(newName);

    }

    public void setDirectorAge(int newAge){

        ((ConcreteDirector) director).setAge(newAge);

    }

//      GETTERS SETTERS ZONE ENDS HERE==============



//teacher add skill logic
    public void teacherDecoratorAddSkill(String subject){
        String[] subjects = subject.split(",");
        for (String subject1 : subjects) {
            teacher = WorkerAddSubjectFactory.addSubject(teacher, subject1);
        }


    }

    public String teacherSkill(){

        return teacher.skills();

    }

    public String teacherWork(){

        return teacher.work();

    }

    //same but for director

    public void directorDecoratorAddSkill(String subject){
        String[] subjects = subject.split(",");
        for (String subject1 : subjects) {
            director = WorkerAddSubjectFactory.addSubject(director, subject1);
        }


    }
    public String directorSkill(){

        return director.skills();

    }

    public String directorWork(){

        return director.work();

    }



    
}
