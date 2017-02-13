public class Print {

    public static void main(String[] args) {
        System.out.println("Jane Doe");
        System.out.println("Hello world!\n(And all the people of the world)");
        for (int i=0; i<5; i++){
            System.out.print(new String(new char[4-i]).replace("\0", " "));
            System.out.println(new String(new char[2*i+1]).replace("\0","*"));
        }
        System.out.println("    *");

    }
}
