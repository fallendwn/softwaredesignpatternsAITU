public class TranslatorAdapter implements IEnglishSpeech{

    private final RussianEngineer someRussianEngineer;

    public TranslatorAdapter(RussianEngineer engineerData){

        this.someRussianEngineer = engineerData;

    }
    
    @Override
    public void speakEnglish(String message){

        String translatedSpeech = translateToEnglish(message);
        someRussianEngineer.speakRussian(translatedSpeech);

    }

    public String translateToEnglish(String message){

        return "Translate:" + message; 

    }


    
}
