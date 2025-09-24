public class EnglishDirector {
    public static void main (String[] args){


        RussianEngineer EgorEngineer = new RussianEngineer();
        EgorEngineer.speakRussian("Привет мой Английский товарищ!");

        TranslatorAdapter VityaTranslator = new TranslatorAdapter(EgorEngineer);

        VityaTranslator.speakEnglish("Hello my English friend!");


    }



}
