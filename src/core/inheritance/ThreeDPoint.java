package core.inheritance;

public class ThreeDPoint extends Point{
    private int z;

    public ThreeDPoint(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    protected String location(){
        return super.location() + ", " + z;
    }

    @Override
    public int manhattanDistanceFromOrigin(){
        return super.manhattanDistanceFromOrigin() + Math.abs(z);
    }

    @Override
    public String toString() {
        return super.toString() + "ThreeDPoint{" +
                "z=" + z +
                '}';
    }
}
