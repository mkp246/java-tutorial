package core.inheritance;

public class ColouredPoint extends Point{
    private String colour;

    public ColouredPoint(int x, int y, String colour) {
        super(x, y);
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "ColouredPoint{" +
                "colour='" + colour + '\'' +
                '}' + super.toString();
    }
}
