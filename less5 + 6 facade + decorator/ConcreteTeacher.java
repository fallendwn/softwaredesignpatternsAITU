public class ConcreteTeacher implements ITeacher{



    @Override
    public String teach(){

        return "I'm teaching";

    }
    @Override
    public String whatLessonsCanTeach(){

        return "I can teach PE";

    }

}
