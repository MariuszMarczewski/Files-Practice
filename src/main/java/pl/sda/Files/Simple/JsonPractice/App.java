package pl.sda.Files.Simple.JsonPractice;



import pl.sda.Files.Simple.JsonPractice.JsonReader;

import java.io.IOException;

class App {

    public static void main(String[] args) throws IOException {

        JsonReader reader = new JsonReader();
        Cars cars = reader.read("C:\\Users\\lenovo\\IdeaProjects\\SDA_J19_Files\\src\\main\\resources\\cars.json");

        JsonAltReader altReader = new JsonAltReader();
        Cars cars2 = altReader.read("C:\\Users\\lenovo\\IdeaProjects\\SDA_J19_Files\\src\\main\\resources\\cars.json");

        JsonAltWriter jsonAltWriter = new JsonAltWriter();
        jsonAltWriter.write(cars2, "C:\\Users\\lenovo\\IdeaProjects\\SDA_J19_Files\\src\\main\\resources\\cars.json");

        int i = 0;
    }
}

