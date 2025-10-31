public class ConcreteDirector implements ISchoolWorker{

    private String name = "Kayrat Nurtas";
    private int age = 20;
    private String subject = "PE";

    @Override
    public String work(){

        return "I'm writing a new article! I have degree in " + subject;

    }

    @Override
    public String skills(){

        return "I can manage people pretty well!";

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
