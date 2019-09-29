package pl.sda.Files.Simple;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SimpleFileWriter {
    void write(String content, String filePath) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath))) {
            bufferedWriter.write(content);
            bufferedWriter.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
