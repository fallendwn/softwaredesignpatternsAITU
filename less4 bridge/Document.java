public abstract class Document {

    IPrinter printer;

    public Document(IPrinter printer){

        this.printer = printer;

    }

    abstract void display();

}


