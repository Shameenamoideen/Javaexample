package task1;

public class Patient {
    private String name;
    private String age;
    private Organ organ;

    public Patient(String name, String age, Organ organ) {
        this.name = name;
        this.age = age;
        this.organ = organ;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public Organ getOrgan() {
        return organ;
    }
}
