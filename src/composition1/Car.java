package composition1;

public class Car {
    private String name;
    private String model;
    private Engine engine;// composition

    public Car(String name, String model, Engine engine) {
        this.name = name;
        this.model = model;
        this.engine = engine;
    }
    public void method(){
        System.out.println(this.name);
        System.out.println(this.model);
        System.out.println(this.getEngine().getModel());
        System.out.println(this.getEngine().getPower());
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }
}
