public class MathSubjectDecorator extends WorkerDecorator{

    
    public MathSubjectDecorator(ISchoolWorker worker){

        super(worker);

    }

    @Override
    public String whatAmIDoing(){
        
        return worker.whatAmIDoing() + ", can teach Math";

    }

    
    

}
