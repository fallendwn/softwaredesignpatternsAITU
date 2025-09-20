

public class Main {
    public static void main(String[] args) {
        ProfileCreator hrCreator = new HRCreator();
        IWorkerProfile hr = hrCreator.createWorkerProfile();

        hr.setName("Mark");
        hr.setAge(30);
        hr.setEmail("Mark@gmail.com");

        System.out.println(hr.getName());
        System.out.println(hr.getAge());
        System.out.println(hr.getEmail());
        hr.Position();

        ProfileCreator managerCreator = new ManagerCreator();
        IWorkerProfile manager = managerCreator.createWorkerProfile();

        manager.setName("Bob");
        manager.setAge(40);
        manager.setEmail("bob@outlook.com");

        System.out.println(manager.getName());
        System.out.println(manager.getAge());
        System.out.println(manager.getEmail());
        manager.Position();
  
    }
}
