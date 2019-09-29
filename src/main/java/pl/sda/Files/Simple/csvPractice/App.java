package pl.sda.Files.Simple.csvPractice;

import java.util.List;

class App {

    public static void main(String[] args){

        pl.sda.Files.Simple.csvPractice.CSVReader csvReader = new pl.sda.Files.Simple.csvPractice.CSVReader();
        List<Movie> movieList = csvReader.read("C:\\Users\\lenovo\\IdeaProjects\\SDA_J19_Files\\src\\main\\resources\\movies.csv");

    }
}
