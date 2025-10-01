public class Presentation extends Document {
    
    public Presentation(IPrinter printer){

        super(printer);

    }

    @Override
    public void display(){

        printer.printMessage("Presentation information");

    }

}
