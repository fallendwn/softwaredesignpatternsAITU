public class Main {
    public static void main(String[] args) {
        
        WorkerFacade facade = new WorkerFacade();

        facade.setTeacherName("Denis Li");
        facade.setTeacherAge(18);
        facade.setTeacherSubject("Calculus");

        System.out.println("before decorator:");
        System.out.println(facade.teacherSkill());
        System.out.println(facade.teacherWork());

        //DECORATORS THROUGH FACTORY
        facade.teacherDecoratorAddSkill("math,russian");

        System.out.println("after decorator:");
        System.out.println(facade.teacherSkill());
        System.out.println(facade.teacherWork());


        facade.createNewTeacher();

        System.out.println("===teachers list===");
        facade.outputAllTeachers();

        //DIRECTOR TEST

        facade.setDirectorName("Kobe Ronaldo");
        facade.setDirectorAge(55);

        System.out.println("before decorator:");
        System.out.println(facade.directorSkill());
        System.out.println(facade.directorWork());

        //director teach math
        facade.directorDecoratorAddSkill("math");

        System.out.println("after decorator:");
        System.out.println(facade.directorSkill());
        System.out.println(facade.directorWork());

        facade.createNewDirector();

        System.out.println("===directors list===");
        facade.outputAllDirectors();
    }
}

