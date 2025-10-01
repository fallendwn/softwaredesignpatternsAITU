public abstract class Document {

    protected IPrinter printer;

    public Document(IPrinter printer){

        this.printer = printer;

    }

    abstract void display();

}


