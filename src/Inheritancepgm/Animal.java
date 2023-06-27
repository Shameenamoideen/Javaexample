package Inheritancepgm;

public class Animal {
    private String name;
    private String color;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }
    public void Method(){
        System.out.println(this.name);


    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
