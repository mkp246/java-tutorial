package core.inheritance;

import java.io.Serializable;

public class Test {
    public static void main(String[] args) {
        String string = "i am don";
        Serializable string1 = "i am don too";
        Object string2 = string;
        System.out.println(string1);
        System.out.println(string2);
        Person p =  new Person("mike", 43);
        Object personObject = p;
        System.out.println(personObject);
    }
}
