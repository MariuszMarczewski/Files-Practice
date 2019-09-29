package pl.sda.Files.Simple.csv;


import java.util.List;

public class App {

    public static void main(String[] args){

        CSVReader csvReader = new CSVReader();
        List<Person> personList = csvReader.read("C:\\Users\\lenovo\\IdeaProjects\\SDA_J19_Files\\src\\main\\resources\\persons.csv");

        CSVWriter writer = new CSVWriter();
        writer.write(personList, "C:\\Users\\lenovo\\IdeaProjects\\SDA_J19_Files\\src\\main\\resources\\test.csv");
    }
}
