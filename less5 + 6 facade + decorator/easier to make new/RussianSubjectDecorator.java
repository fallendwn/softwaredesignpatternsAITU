public class RussianSubjectDecorator extends WorkerDecorator{
    
    public RussianSubjectDecorator(ISchoolWorker worker){

        super(worker);

    }

    @Override
    public String work(){

        return worker.work() + " Teaching Russian! ";

    }

    @Override
    public String skills(){

        return worker.skills() + " I can teach Russian! ";

    }

}
