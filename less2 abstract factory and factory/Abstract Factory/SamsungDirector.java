public class SamsungDirector implements IDirector {
    

    private int age = 300;
    private String name = "salam";
    private String email = "ajaja";
    private int salary = 200;
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
