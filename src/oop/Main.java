package oop;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Person pekka = new Person("pekka");
        Person brian = new Person("brian");
        Person martin = new Person("martin");
        Person kali = pekka;
        kali.becomeOlder();
        pekka.printPerson();
        pekka.becomeOlder();
        pekka.printPerson();
        System.out.println("pekka adult : " + pekka.isAdult());
        brian.printPerson();
        martin.printPerson();
        String c = "3";
    }
}
