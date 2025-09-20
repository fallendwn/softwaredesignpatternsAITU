
public class ManagerCreator extends  ProfileCreator{

    @Override
    public IWorkerProfile createWorkerProfile(){

        return new Manager();

    }



}
