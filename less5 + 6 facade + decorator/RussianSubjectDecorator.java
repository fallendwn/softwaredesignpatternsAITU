public class RussianSubjectDecorator extends TeacherDecorator{
    public RussianSubjectDecorator(ITeacher teacher){

        super(teacher);

    }

    @Override
    public String whatLessonsCanTeach(){
        
        return teacher.whatLessonsCanTeach() + ", Russian";

    }

}
