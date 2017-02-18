package core.generics;

public interface Identifiable extends Comparable<Identifiable>{
    String getID();
    int compareTo(Identifiable identifiable);
}
