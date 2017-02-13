import java.util.Collection;
import java.util.Scanner;

public class Reader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name?");
        String name = scanner.nextLine();
        System.out.println("Hi, + " + name);
        System.out.println("enter age?");
        int age = scanner.nextInt();
        System.out.printf("you are %s years old\n", age);
        System.out.print("type the radius: ");
        int radius = scanner.nextInt();
        System.out.println("Circumference of the circle: " + 2*Math.PI*radius);
    }
}
