package core;

import java.util.Scanner;

public class RegexTest {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.println("enter student number");
            String num = reader.nextLine();
            System.out.println(num.matches("01[0-9]{7}"));
            System.out.println(num.matches("00|11|0000"));
            System.out.println(num.matches("look(er|ed|s|ing)"));
            System.out.println(num.matches("trolo(lo)*"));
            System.out.println(num.matches("trolo(lo)+"));
            System.out.println(num.matches("trolo(lo)?"));
            System.out.println(num.matches("trolo(lo){3}"));
            System.out.println(num.matches("trolo(lo){1,5}"));
            System.out.println(num.matches("[a-bA-C]*"));
        }
    }
}
