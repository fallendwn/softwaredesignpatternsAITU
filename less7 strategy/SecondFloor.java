public class SecondFloor implements IFloor {
 
    
    private String message = "Second Floor";


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
