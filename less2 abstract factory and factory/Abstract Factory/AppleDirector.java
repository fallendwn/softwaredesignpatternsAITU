public class AppleDirector implements IDirector{
    
    private int age;
    private String name;
    private String email;
    private int salary;
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
    public void setSalary(int salary){

        this.salary = salary;

    }
    @Override
    public int getSalary(){

        return this.salary;

    }


}
