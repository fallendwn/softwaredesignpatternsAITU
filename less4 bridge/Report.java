public class Report extends Document{

    public Report(IPrinter printer){

        super(printer);

    }

    @Override
    public void display(){

        printer.printMessage("Report information");

    }

}