package composition1;

public class Engine {
    private String model;
    private String power;
    private Interior interior; //composition


    public Engine(String model, String power, Interior interior) {
        this.model = model;
        this.power = power;
        this.interior = interior;
    }

    public String getModel() {
        return model;
    }

    public String getPower() {
        return power;
    }

    public Interior getInterior() {
        return interior;
    }
}
