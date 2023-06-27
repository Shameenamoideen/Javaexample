package Inheritancepgm;

public class Birds extends Animal{
    private boolean wings;
    public Birds(String name, String color,boolean wings) {
        super(name, color);
        this.wings=wings;

    }

    @Override
    public void Method() {
        super.Method();
        System.out.println(this.wings);
    }

    public boolean isWings() {
        return wings;
    }
}
