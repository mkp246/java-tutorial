package core;

import java.util.ArrayList;

public class InterfaceTest {
    public static void main(String[] args) {
        SMS message = new SMS("ks", "how are you?");
        System.out.println(message.read());
        ArrayList<SMS> messages = new ArrayList<SMS>();
        messages.add(new SMS("unknown", "we had surprize test today"));
        messages.add(new SMS("tipu", "ghar kab aayega"));

        ArrayList<String> pages = new ArrayList<String>();
        pages.add("Split your method into short clear chunks.");
        pages.add("Devide the user interface logic from the application logic.");
        pages.add("At first, always code only a small program which solves only a part of the problem.");
        pages.add("Practice makes perfect. Make up your own fun project.");

        EBook eBook = new EBook("Programming Hints", pages);
        for (int i = 0; i<eBook.howManyPages(); i++){
            System.out.println(eBook.read());
        }
        SMS me = (SMS)(Readable) message;
    }
}