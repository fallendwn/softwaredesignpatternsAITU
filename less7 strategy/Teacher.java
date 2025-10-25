public class Teacher {
    
    private IFloor StrategyFloor;
    public void setStrategy(IFloor strategy){

        this.StrategyFloor = strategy;

    }

    public String selectFloor(){

        return StrategyFloor.useFloor();

    }


}
