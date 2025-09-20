abstract class ProfileCreator{

    public void whatPosition(){

        IWorkerProfile worker = createWorkerProfile();
        worker.Position();

    }

    public abstract IWorkerProfile createWorkerProfile();

}