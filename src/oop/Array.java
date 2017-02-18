package oop;

import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 9, 37, 99};
        System.out.println(numbers[1]);

        int j = 0;
        for (int i = 0; i < numbers.length; i++, j++) {
            System.out.println(numbers[i]);
            System.out.println(j);
        }

        for (int number : numbers) {
            System.out.println(number);
            number = 8;
        }

        for (int i = 1; i <= 10; i++) {

            for (int k = 1; k <= 10; k++) {
                System.out.printf("%3s", i * k);
            }
            System.out.println();
        }

        int[] values = {9,-3,6,-32,32};
        Arrays.sort(values);
        System.out.println(Arrays.toString(values));
        BigDecimal bd = new BigDecimal(2312, new MathContext(32));

        Person[] persons= new Person[3];
        persons[0] = new Person("p1");
        Person p1 = new Person("p2");
        persons[2] = new Person("p3");
        persons[1] = p1;
        p1.becomeOlder();
        p1.becomeOlder();
        p1.becomeOlder();
        for (Person person : persons){
            person.printPerson();
        }

    }
}
