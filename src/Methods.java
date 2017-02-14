import java.awt.*;
import java.util.ArrayList;

public class Methods {

    public static void main(String[] args) {
        int number = 1;
        System.out.println("main : " + number);
        addThree(number,"32","mkp");
        System.out.println("main after method: " + number);

    }

    public static void addThree(int number, String ... cd){
        for(String a : cd){
            System.out.println(a);
        }
        System.out.println("method : " + number);
        StringBuffer buffer = new StringBuffer("lolk");
        System.out.println(buffer.reverse());
        number += 3;
        System.out.println("method : after adding : " + number);
        Toolkit.getDefaultToolkit().beep();
    }
}
