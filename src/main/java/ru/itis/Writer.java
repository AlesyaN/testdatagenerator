package ru.itis;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    private File file;
    private FileWriter writer;

    public Writer() {
        file = new File("test-data.txt");
        try {
            writer = new FileWriter(file);
        } catch (IOException e) {
            System.out.println("Exception while creating writer to file");
        }
    }

    public void write(String json) {
        try {
            writer.write(json + "\n");
            writer.flush();
        } catch (IOException e) {
            System.out.println("Exception while writing to file");
        }
    }
}
