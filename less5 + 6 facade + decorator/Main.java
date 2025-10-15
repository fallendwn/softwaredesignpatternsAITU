public class Main {

    public static void main(String[] args){

        TeacherSkillFacade facade = new TeacherSkillFacade();

        System.out.println(facade.AddSkill("MaTh"));
        System.out.println(facade.AddSkill("math, russian"));
        System.out.println(facade.AddSkill("russian, math"));
        System.out.println(facade.AddSkill("russian,math"));
        System.out.println(facade.AddSkill("math,russian"));
        System.out.println(facade.AddSkill("russiAN"));
        System.out.println(facade.AddSkill("russia"));
        
    }

    
}
