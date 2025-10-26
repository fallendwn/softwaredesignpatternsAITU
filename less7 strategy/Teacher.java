public class Teacher {
    
    private IFloor floorStrategy;
    public void setStrategy(IFloor strategy){

        this.floorStrategy = strategy;

    }

    public String selectFloor(){
        if(floorStrategy == null){

            return "no floor selected";

        }
        return floorStrategy.useFloor();

    }


}
