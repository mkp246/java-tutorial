package core.inheritance.abstracts;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private Scanner reader;
    private List<Operation> operations;

    public UserInterface(Scanner reader) {
        this.reader = reader;
        this.operations = new ArrayList<Operation>();
    }

    public void addOperation(Operation operation) {
        this.operations.add(operation);
    }

    private void printOperations() {
        System.out.println("\t0: Quit");
        for (int i = 0; i < this.operations.size(); i++) {
            String operationName = this.operations.get(i).getName();
            System.out.println("\t" + (i + 1) + ": " + operationName);
        }
    }

    public void start(){
        while (true){
            printOperations();
            System.out.println("choice : ");
            String choice = reader.next();
            if(choice.equals("0")){
                break;
            }
            executeOperation(choice);
            System.out.println();
        }
    }

    private void executeOperation(String choice){
        int operation = Integer.parseInt(choice);
        Operation chosen = operations.get(operation - 1);
        chosen.execute(reader);
    }
}