public class MathSubjectDecorator extends TeacherDecorator{

    
    public MathSubjectDecorator(ITeacher teacher){

        super(teacher);

    }

    @Override
    public String whatLessonsCanTeach(){
        
        return teacher.whatLessonsCanTeach() + ", Math";

    }

    
    

}
