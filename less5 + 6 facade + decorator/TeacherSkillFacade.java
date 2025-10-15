public class TeacherSkillFacade{
    ITeacher russianSubjectDecorator = new RussianSubjectDecorator(new ConcreteTeacher());
    ITeacher mathSubjectDecorator = new MathSubjectDecorator(new ConcreteTeacher());
    ITeacher MathAndRussianSubjectDecorator = new MathSubjectDecorator(new RussianSubjectDecorator(new ConcreteTeacher()));


    public String AddSkill(String whichSkill){
        whichSkill = whichSkill.toLowerCase().strip();
        if(whichSkill.equals("math")){
        
            return mathSubjectDecorator.whatLessonsCanTeach();

        }
        else if(whichSkill.equals("russian")){

            return russianSubjectDecorator.whatLessonsCanTeach();

        }
        else if(whichSkill.equals("russian, math") 
        || whichSkill.equals("math, russian")
        || whichSkill.equals("math,russian")
        || whichSkill.equals("russian,math"))
        {

            return MathAndRussianSubjectDecorator.whatLessonsCanTeach();

        }
        else{

            return "invalid input";

        }

    }


}