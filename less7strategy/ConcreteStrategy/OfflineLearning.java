package ConcreteStrategy;

import Strategy.LearningStrategy;

public class OfflineLearning implements LearningStrategy{
    
    private String learningType = "I'm currently learning offline";

    @Override
    public String learn(){

        return learningType;

    }

    public String getLearnType(){

        return learningType;

    }

    public void setLearnType(String newLearningType){

        this.learningType = newLearningType;

    }

}
