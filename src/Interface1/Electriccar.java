package Interface1;

public class Electriccar implements Carinterface,Cngcar {


    @Override
    public void start() {
        System.out.println("started");

    }

    @Override
    public void move(int speed) {
        System.out.println("Speed: "+speed);

    }

    @Override
    public void stop() {
        System.out.println("Car stopped...");

    }
}
