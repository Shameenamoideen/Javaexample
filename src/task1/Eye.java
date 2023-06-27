package task1;
public class Eye extends Organ{
    private String eyename;
    private String eyecolor;

    public Eye(String name, String eyename, String eyecolor) {
        super(name);
        this.eyename = eyename;
        this.eyecolor = eyecolor;
    }

    public String getEyename() {
        return eyename;
    }

    public String getEyecolor() {
        return eyecolor;
    }

    @Override
    public void details() {
        super.details();
        System.out.println(this.eyename);
        System.out.println(this.eyecolor);
    }
}
