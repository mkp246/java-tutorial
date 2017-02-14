import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Lists {
    public static void main(String[] args) {
        ArrayList<String> teachers = new ArrayList<String>();
        teachers.add("Anthony");
        teachers.add("Barto");
        teachers.add("John");
        teachers.add("Martin");
        teachers.add("Matt");
        teachers.add("Paul");
        Collections.sort(teachers);
        for (String teacher : teachers){
            System.out.println(teacher);
        }
        Collections.reverse(teachers);
        for (String teacher : teachers){
            System.out.println(teacher);
        }
        teachers.remove(new Integer(1));
    }
}
