package pl.sda.Files.Simple.JsonPractice;

import org.json.JSONObject;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class JsonWriter {

 void write(Cars car, String filePath) {
    String content = carsToJson(car);

    try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
        writer.write(content);
        writer.flush();
    } catch (IOException e) {
        e.printStackTrace();
    }
}

    private String carsToJson(Cars cars) {
        JSONObject jsonToSave = new JSONObject();

        jsonToSave.put("name", cars.getName());
        jsonToSave.put("colour", cars.getColour());
        jsonToSave.put("year", cars.getYear());

        JSONObject registration = new JSONObject();
        registration.put("city", cars.getRegistration().getCity());
        registration.put("street", cars.getRegistration().getStreet());
        registration.put("year", cars.getRegistration().getYear());

        jsonToSave.put("registration", registration);

        return jsonToSave.toString(2);
    }
}
