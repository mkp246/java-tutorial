package oop;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Set;

public class HashMaps {
    public static void main(String[] args) {
        HashMap numbers = new HashMap<String , String>();
        numbers.put("one", "yikki");
        numbers.put("two", "kalski");

        System.out.println(numbers.get("one"));
        System.out.println(numbers.get("two"));
        numbers.put("two", "kolka");
        System.out.println(numbers.get("two"));
        System.out.println(numbers.get("three"));

        HashMap bookCollection = new HashMap<String, Book>();
        Book sense = new Book("sense and ability", "...", 1811);
        Book pride = new Book("pride and prejudice", "...", 1831);

        bookCollection.put(sense.getName(), sense);
        bookCollection.put(pride.getName(), pride);

        System.out.println(bookCollection.get("lola"));
        System.out.println(bookCollection.get(sense.getName()));
        
    }
}