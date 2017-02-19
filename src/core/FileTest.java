package core;

import java.io.FileWriter;

public class FileTest {
    public static void main(String[] args) throws Exception {
        FileWriter writer = new FileWriter("src/output.txt");
        writer.write("hi file\n");
        writer.write("sample text\n");
        writer.write("and more text\n");
        writer.close();

        FileHandler fileHandler = new FileHandler();
        fileHandler.writeToFile("src/diary.txt", "dear diary, i am on leave today\n");
        fileHandler.appendToFile("src/diary.txt", "i was late to office on friday\n ");
    }
}
