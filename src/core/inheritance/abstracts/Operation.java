package core.inheritance.abstracts;

import java.util.Scanner;

public abstract class Operation {
    private String name;

    public Operation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void execute(Scanner reader);
}