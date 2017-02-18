package core.inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Motor motor = new Motor("combustion engine", "hz", "volkswagen", "VW GOLF 1L 86-91");
        System.out.println(motor.getDescription());
        System.out.println(motor.getMotorType());
        System.out.println(motor);
    }
}
