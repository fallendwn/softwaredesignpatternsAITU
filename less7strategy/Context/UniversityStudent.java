package Context;

import Strategy.LearningStrategy;

public class UniversityStudent {
    LearningStrategy strategy;

    public UniversityStudent(LearningStrategy strategy){

        this.strategy = strategy;

    }

    public void setLearnStrategy(LearningStrategy newStrategy){

        this.strategy = newStrategy;

    }
    
    public String performTask(){

        return strategy.learn();

    }


}
