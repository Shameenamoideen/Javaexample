package Interface1;

import composition1.Car;

public class Main {
    public static void main(String[] args) {
        Carinterface inter=new Electriccar();
        inter.start();
        inter.move(60);
        Cngcar inter2=new Electriccar();
inter2.stop();

    }
}
