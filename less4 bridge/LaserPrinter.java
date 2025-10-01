public class LaserPrinter implements IPrinter {
        @Override
        public void printMessage(String message){
            System.out.println("Laser: " + message);

        }
}
