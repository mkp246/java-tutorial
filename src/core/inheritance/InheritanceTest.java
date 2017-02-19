package core.inheritance;

import java.util.ArrayList;
import java.util.List;

public class InheritanceTest {
    public static void main(String[] args) {
        Motor motor = new Motor("combustion engine", "hz", "volkswagen", "VW GOLF 1L 86-91");
        System.out.println(motor.getDescription());
        System.out.println(motor.getMotorType());
        System.out.println(motor);

        List<Point> points = new ArrayList<Point>();
        points.add(new Point(2,4));
        points.add(new ColouredPoint(1,6, "red"));
        points.add(new ColouredPoint(9,6, "blue"));
        points.add(new Point(0,1));
        points.add(new ThreeDPoint(0,1, 9));

        for(Point point : points) System.out.println(point);
    }
}
