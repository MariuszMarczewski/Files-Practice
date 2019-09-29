package pl.sda.Files.Simple.json;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {

        JsonReader reader = new JsonReader();
        Person person = reader.read("C:\\Users\\lenovo\\IdeaProjects\\SDA_J19_Files\\src\\main\\resources\\person.json");

        JsonAltReader altReader = new JsonAltReader();
        Person person2 = altReader.read("C:\\Users\\lenovo\\IdeaProjects\\SDA_J19_Files\\src\\main\\resources\\person.json");

        JsonAltWriter jsonAltWriter = new JsonAltWriter();
        jsonAltWriter.write(person2, "C:\\Users\\lenovo\\IdeaProjects\\SDA_J19_Files\\src\\main\\resources\\person.json");

        int i = 0;
    }
}
