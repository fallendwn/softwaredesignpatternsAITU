public class ThirdFloor implements IFloor{

    private String message = "First Floor";

    @Override
    public String useFloor(){
        return message;

    }

    public String getMessage(){

        return message;

    }

    public void setMessage(String newMessage){

        this.message = newMessage;

    }

}
