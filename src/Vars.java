public class Vars {
    public static void main(String[] args) {
        printData(3, 5.5, "There is none!");
        printData(9000, 0.1, "Zetor");

        int dividend = 3;
        int divisor = 2;

        double quotient = dividend * 1.0 / divisor;
        System.out.println(quotient);

        System.out.printf("There are %d seconds in a year.", 356*24*60*60);
    }
    private static void printData(int chickens, double bacon, String tractor){
        System.out.println("Chickens:\n" +
                chickens + "\n" +
                "Bacon (kg):\n" +
                bacon + "\n" +
                "A tractor:\n" +
                tractor + "\n\n" +
                "In a nutshell:\n" +
                chickens + "\n" +
                bacon + "\n" +
                tractor + "\n");
    }
}
