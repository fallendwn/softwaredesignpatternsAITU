public class Main{

    public static void main(String[] args) {
        
        IPrinter laserPrinter = new LaserPrinter();
        IPrinter termoPrinter = new TermoPrinter();

        Document laserReport = new Report(laserPrinter);
        Document termoReport = new Report(termoPrinter);

        Document laserPresentation = new Presentation(laserPrinter);
        Document termoPresentation = new Presentation(termoPrinter);


        laserPresentation.display();
        laserReport.display();


        termoPresentation.display();
        termoReport.display();

    }

}