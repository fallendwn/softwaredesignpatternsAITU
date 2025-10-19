public class RussianSubjectDecorator extends WorkerDecorator{
    public RussianSubjectDecorator(ISchoolWorker worker){

        super(worker);

    }

    @Override
    public String whatAmIDoing(){
        
        return worker.whatAmIDoing() + ", can teach Russian";

    }

}
