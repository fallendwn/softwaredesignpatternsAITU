public abstract class WorkerDecorator implements ISchoolWorker{
    
    protected ISchoolWorker worker;

    public WorkerDecorator (ISchoolWorker worker){

        this.worker = worker;

    }

    @Override
    public String work(){

        return worker.work();

    }

    @Override
    
    public String skills(){

        return worker.skills();

    }

    @Override
    public int getAge(){

        return worker.getAge();

    }

    @Override
    public String getName(){

        return worker.getName();

    }
    @Override
    public String getSubject(){

        return worker.getSubject();

    }
}
