package core.generics;

public class RegisterTest {
    public static void main(String[] args) throws Exception {
        Register personnel = new Register();
        personnel.add(new Person("pekka", "210443-WE32"));
        personnel.add(new Person("milan", "280793-XYZQ"));
        System.out.println(personnel.get("321312-EW21"));
        System.out.println(personnel.get("210443-WE32"));

        try {

        } catch (IllegalArgumentException | NullPointerException n) {
            throw new Exception();
        }
    }
}
