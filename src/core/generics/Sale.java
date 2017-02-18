package core.generics;

public class Sale implements Identifiable {
    private String name;
    private String barcode;
    private int stockBalance;
    private int price;

    public Sale(String name, String barcode) {
        this.name = name;
        this.barcode = barcode;
    }

    @Override
    public String getID() {
        return barcode;
    }

    @Override
    public int compareTo(Identifiable identifiable) {
        return this.getID().compareTo(identifiable.getID());
    }
}
