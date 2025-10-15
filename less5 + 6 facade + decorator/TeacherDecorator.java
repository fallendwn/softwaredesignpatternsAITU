public class TeacherDecorator extends ConcreteTeacher {
    
    protected ITeacher teacher;

    public TeacherDecorator(ITeacher teacher){

        this.teacher = teacher;

    }

    @Override
    public String teach(){

        return teacher.teach();

    }

    @Override
    public String whatLessonsCanTeach(){

        return teacher.whatLessonsCanTeach();

    }
}
