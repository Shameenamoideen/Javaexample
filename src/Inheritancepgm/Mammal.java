package Inheritancepgm;

public class Mammal extends Animal {
    private int l;

    public Mammal(String name, String color, int l) {
        super(name, color);
        this.l = l;
    }

    @Override
    public void Method() {
        super.Method();
        System.out.println(this.getL());
    }

    public int getL() {
        return l;
    }
}
