public class AppleFactory implements EmployeesGUI{
    
    
    @Override
    public IDirector createDirector(){

        return new AppleDirector();

    }

    @Override
    public IWorker createWorker(){

        return new AppleWorker();

    }

}
