package Context;

import Strategy.LearningStrategy;

public class SchoolStudent {
    LearningStrategy strategy;

    public SchoolStudent(LearningStrategy strategy){

        this.strategy = strategy;

    }

    public void setLearnStrategy(LearningStrategy newStrategy){

        this.strategy = newStrategy;

    }
    
    public String performTask(){

        return strategy.learn();

    }

}
