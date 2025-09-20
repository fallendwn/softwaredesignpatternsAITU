public class SamsungWorker implements IWorker{
    
    private int age;
    private String name;
    private String email;
    private String position;
    @Override
    public void setAge(int age){

        this.age = age;

    }
    @Override
    public int getAge(){

        return this.age;

    }
    @Override
    public void setName(String name){

        this.name = name;

    }
    @Override
    public String getName(){

        return this.name;

    }
    @Override
    public void setEmail(String email){

        this.email = email;

    }
    @Override
    public String getEmail(){

        return this.email;

    }
    @Override
    public void setPosition(String position){

        this.position = position;

    }
    @Override
    public String getPosition(){

        return this.position;

    }

}
