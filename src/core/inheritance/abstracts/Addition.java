package core.inheritance.abstracts;

import java.util.Scanner;

public class Addition extends Operation{
    public Addition() {
        super("Addition");
    }

    @Override
    public void execute(Scanner reader) {
        System.out.println("give first number");
        int first = Integer.parseInt(reader.next());
        System.out.println("give second number");
        int second = Integer.parseInt(reader.next());
        System.out.println("thu sum is : " + (first+second));

    }
}
