package composition1;

public class Interior {
    private String seat;
    private String color;

    public Interior(String seat, String color) {
        this.seat = seat;
        this.color = color;
    }

    public String getSeat() {
        return seat;
    }

    public String getColor() {
        return color;
    }
}
