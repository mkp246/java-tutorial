package core.generics;

import java.util.ArrayList;

public class Person implements Identifiable{
    private String name;
    private String id;

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    @Override
    public String getID() {
        return getId();
    }

    @Override
    public int compareTo(Identifiable identifiable) {
        return this.getID().compareTo(identifiable.getID());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

}
