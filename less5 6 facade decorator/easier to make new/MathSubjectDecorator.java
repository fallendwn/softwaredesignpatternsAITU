public class MathSubjectDecorator extends WorkerDecorator{
    
    public MathSubjectDecorator(ISchoolWorker worker){

        super(worker);

    }

    @Override
    public String work(){

        return worker.work() + " Teaching Math! ";

    }

    @Override
    public String skills(){

        return worker.skills() + " I can teach Math! ";

    }


}
