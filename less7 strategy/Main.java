public class Main {
    public static void main(String[] args) {
        String pick_floor_message = "Teacher is picking - ";

        Teacher teacher = new Teacher();



        IFloor first_floor = new FirstFloor();

        IFloor second_floor = new SecondFloor();
        
        IFloor third_floor = new ThirdFloor();


        teacher.setStrategy(first_floor);

        System.out.println(pick_floor_message + teacher.selectFloor());

        teacher.setStrategy(second_floor);

        System.out.println(pick_floor_message + teacher.selectFloor());

        teacher.setStrategy(third_floor);

        System.out.println(pick_floor_message + teacher.selectFloor());


        first_floor.setMessage("Welcome to the FIRST Floor!");

        second_floor.setMessage("Welcome to the SECOND Floor!");

        third_floor.setMessage("Welcome to the THIRD floor!");


        teacher.setStrategy(first_floor);

        System.out.println(teacher.selectFloor());

        teacher.setStrategy(second_floor);

        System.out.println(teacher.selectFloor());

        teacher.setStrategy(third_floor);

        System.out.println(teacher.selectFloor());



        
    }
}
