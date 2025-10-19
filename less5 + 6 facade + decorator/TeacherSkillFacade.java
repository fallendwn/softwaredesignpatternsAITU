public class TeacherSkillFacade{
    ISchoolWorker russianTeacherDecorator = new RussianSubjectDecorator(new ConcreteWorker().new Teacher());
    ISchoolWorker mathTeacherDecorator = new MathSubjectDecorator(new ConcreteWorker().new Teacher());
    ISchoolWorker MathAndRussianTeacherDecorator = new MathSubjectDecorator(new RussianSubjectDecorator(new ConcreteWorker().new Teacher()));

    ISchoolWorker russianDirectorDecorator = new RussianSubjectDecorator(new ConcreteWorker().new Director());
    ISchoolWorker mathDirectorDecorator = new MathSubjectDecorator(new ConcreteWorker().new Director());
    ISchoolWorker MathAndRussianDirectorDecorator = new MathSubjectDecorator(new RussianSubjectDecorator(new ConcreteWorker().new Director()));



    public String AddSkill(String whichSkill, String whichPerson){
        whichSkill = whichSkill.toLowerCase().strip();
        whichPerson = whichPerson.toLowerCase().strip();
        if(whichSkill.equals("math")){

            if (whichPerson.equals("teacher")){
                return mathTeacherDecorator.whatAmIDoing();
            }

            else if (whichSkill.equals("director")){

                return mathDirectorDecorator.whatAmIDoing();

            }
            return "invalid input";
        }
        else if(whichSkill.equals("russian")){
            if (whichPerson.equals("teacher")){
                return russianTeacherDecorator.whatAmIDoing();
            }
            else if (whichSkill.equals("director")){

                return russianDirectorDecorator.whatAmIDoing();

            }
            return "invalid input";
        }
        else if(whichSkill.equals("russian, math") 
        || whichSkill.equals("math, russian")
        || whichSkill.equals("math,russian")
        || whichSkill.equals("russian,math"))
        {
            if (whichPerson.equals("teacher")){
                return MathAndRussianTeacherDecorator.whatAmIDoing();

            }
            else if (whichSkill.equals("director")){

                return MathAndRussianDirectorDecorator.whatAmIDoing();

            }

                return "invalid input";



        }


        return "invalid input";


    }


}