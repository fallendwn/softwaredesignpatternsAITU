public class WorkerAddSubjectFactory {

    public static ISchoolWorker addSubject(ISchoolWorker worker, String subject){
        subject = subject.toLowerCase().strip();
        worker = switch (subject){

            case "math" -> new MathSubjectDecorator(worker);
            case "russian" -> new RussianSubjectDecorator(worker);
            default -> worker;

        };
        return worker;

    }
    
}
