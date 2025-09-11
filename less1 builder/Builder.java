public class Builder{

    public String name;
    public int age;
    public String email;
    public String position;

    public Builder setName(String name){
        this.name = name;
        return this;
    }

    public Builder setAge(int age){
        this.age = age;
        return this;
    }
    public Builder setEmail(String email){
        this.email = email;
        return this;
    }
    public Builder setPosition(String position){
        this.position = position;
        return this;
    }

    public Office build(){
        return new Office(this);
    }

}