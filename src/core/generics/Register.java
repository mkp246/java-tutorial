package core.generics;

import java.util.*;

public class Register {
    private HashMap<String, Identifiable> registered;

    public Register() {
        registered = new HashMap<String, Identifiable>();
    }

    public void add(Identifiable identifiable){
        registered.put(identifiable.getID(), identifiable);
    }

    public Identifiable get(String id){
        return registered.get(id);
    }
    public List<Identifiable> getAll(){
        return (ArrayList<Identifiable>) registered.values();
    }

    public ArrayList<Identifiable> sortAndGetAll(){
        ArrayList<Identifiable> all = new ArrayList<Identifiable>(registered.values());
        Collections.sort(all);
        return all;
    }
}
