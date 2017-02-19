package core.inheritance.abstracts;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        UserInterface ui = new UserInterface(new Scanner(System.in));
        ui.addOperation(new Addition());
        ui.start();
    }
}
