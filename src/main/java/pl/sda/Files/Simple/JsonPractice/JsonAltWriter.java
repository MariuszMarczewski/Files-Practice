package pl.sda.Files.Simple.JsonPractice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class JsonAltWriter {

    void write(Cars cars, String filePath) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String content = objectMapper.writeValueAsString(cars);

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

