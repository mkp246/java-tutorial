package core;

import java.io.FileWriter;

public class FileHandler {
    public void writeToFile(String filename, String text) throws Exception{
        FileWriter writer = new FileWriter(filename);
        writer.write(text);
        writer.close();
    }

    public void appendToFile(String filename, String text) throws Exception{
        FileWriter writer = new FileWriter(filename, true);
        writer.write(text);
        writer.close();
    }
}
