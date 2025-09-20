public class Office{

    private final String name;
    private int age;
    private final String email;
    private final String position;


    public Office(Builder builder){

        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
        this.position = builder.position;

    }


    public String getName(){
        return this.name;
    }

    public String getEmail(){
        return this.email;
    }

    public int getAge(){
        return this.age;
    }

    public String getPosition(){
        return this.position;
    }

    @Override
    public String toString() {
        return this.name + ' ' + this.age + ' ' + this.email + ' ' + this.position + ' ';
    }

}

