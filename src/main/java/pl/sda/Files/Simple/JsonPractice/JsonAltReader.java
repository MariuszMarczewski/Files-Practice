package pl.sda.Files.Simple.JsonPractice;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class JsonAltReader {

    Cars read(String filePath) throws IOException {
        byte[] bytes = Files.readAllBytes(Paths.get(filePath));
        String content = new String(bytes, "UTF-8");

        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(content, Cars.class);
    }
}
