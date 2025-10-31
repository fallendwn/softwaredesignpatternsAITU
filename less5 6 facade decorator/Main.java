public class Main {

    public static void main(String[] args){

        TeacherSkillFacade facade = new TeacherSkillFacade();

        System.out.println(facade.AddSkill("MaTh", "DirectoR"));
        System.out.println(facade.AddSkill("math, russian", "tEACHER"));
        System.out.println(facade.AddSkill("russian, math", "DirECtor"));
        System.out.println(facade.AddSkill("russian,math", "teAcher"));
        System.out.println(facade.AddSkill("math,russian", "teac"));
        System.out.println(facade.AddSkill("russiAN", "teach"));
        System.out.println(facade.AddSkill("russia", "direct"));
        
    }

    
}
