package pl.sda.Files.Simple.JsonPractice;

import org.json.JSONObject;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class JsonReader {
    Cars read(String filePath) {
        Cars result = new Cars();
        try {
            byte[] bytes = Files.readAllBytes(Paths.get(filePath));
            String content = new String(bytes, "UTF-8");

            JSONObject object = new JSONObject(content);
            String name = object.getString("name");
            String colour = object.getString("colour");
            int year = object.getInt("year");


            Object registrationObject = object.get("registration");
            JSONObject registrationJSON = new JSONObject(registrationObject.toString());
            String city = registrationJSON.getString("city");
            String street = registrationJSON.getString("street");
            int registrationYear = registrationJSON.getInt("year");

            result.setName(name);
            result.setYear(year);
            result.setColour(colour);

            Registration registration = new Registration();
            registration.setCity(city);
            registration.setStreet(street);
            registration.setYear(registrationYear);

            result.setRegistration(registration);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }
}

