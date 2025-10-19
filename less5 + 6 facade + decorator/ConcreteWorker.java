public class ConcreteWorker{


    public class Teacher implements ISchoolWorker{
        String mainSubject = "PE";
        @Override
        public String teach(){

            return "I'm teaching";

        }
        @Override
        public String whatAmIDoing(){

            return "I can teach " + mainSubject;

        }
    }

    public class Director implements ISchoolWorker{

        @Override
        public String teach(){

            return "I'm teaching, but this is not my main duty";

        }

        @Override
        public String whatAmIDoing(){

            return "I'm ruling teachers";

        }

    }

}
