public class SamsungFactory implements EmployeesGUI{

    @Override
    public IDirector createDirector(){

        return new SamsungDirector();

    }

    @Override
    public IWorker createWorker(){

        return new SamsungWorker();

    }

}
