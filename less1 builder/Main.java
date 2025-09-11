public class Main{
    public static void main(String[] args){

        Office OfficeWorker1 = new Builder()
        .setEmail("officeworker@gmail.com")
        .setName("Fred")
        .setPosition("HR")
        .setAge(23)
        .build();
        System.out.println(OfficeWorker1);
    }
}