public class WorkerDecorator implements ISchoolWorker {
    
    protected ISchoolWorker worker;

    public WorkerDecorator(ISchoolWorker worker){

        this.worker = worker;

    }

    @Override
    public String teach(){

        return worker.teach();

    }

    @Override
    public String whatAmIDoing(){

        return worker.whatAmIDoing();

    }
}
