public class HRCreator extends ProfileCreator{

    @Override
    public IWorkerProfile createWorkerProfile(){

        return new HR();

    }

}
