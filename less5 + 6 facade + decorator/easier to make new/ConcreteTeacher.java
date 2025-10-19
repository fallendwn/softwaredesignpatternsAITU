public class ConcreteTeacher implements ISchoolWorker{

    private String name = "Barry Allen";
    private int age = 30;
    private String subject = "PE";
    

    @Override
    public String work(){

        return "I'm teaching kids right now!";

    }

    @Override
    public String skills(){

        return "I can teach people! My primary subject - " + subject;

    }
    
    protected void setName(String newName){

        this.name = newName;

    }
    @Override
    public String getName(){

        return this.name;

    }

    protected void setAge(int newAge){

        this.age = newAge;

    }
    @Override
    public int getAge(){

        return this.age;

    }
    
    protected void setSubject(String newSubject){

        this.subject = newSubject;

    }
    @Override
    public String getSubject(){

        return this.subject;

    }

}
