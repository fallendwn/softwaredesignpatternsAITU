public class Main {
    public static void main(String[] args){

        AppleFactory appleFactory = new AppleFactory();
        IWorker appleWorker = appleFactory.createWorker();
        IDirector appleDirector = appleFactory.createDirector();

        appleWorker.setName("Dylan");
        System.out.println(appleWorker.getName());

        appleDirector.setSalary(200);
        System.out.println(appleDirector.getSalary());

        SamsungFactory samsungFactory = new SamsungFactory();
        IWorker samsungWorker = samsungFactory.createWorker();
        IDirector samsungDirector = samsungFactory.createDirector();

        samsungWorker.setName("Kalavan");
        System.out.println(samsungWorker.getName());

        samsungDirector.setSalary(4500);
        System.out.println(samsungDirector.getSalary());

    }
}
