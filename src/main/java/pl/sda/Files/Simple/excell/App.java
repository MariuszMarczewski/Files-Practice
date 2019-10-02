package pl.sda.Files.Simple.excell;

import java.util.List;

public class App {

    public static void main(String[] args) {
        ExcellWriter excellWriter = new ExcellWriter();
        List<Person> persons = excellWriter.write("C:\\Users\\lenovo\\IdeaProjects\\SDA_J19_Files\\src\\main\\resources\\excel.xlsx");
    }
}
