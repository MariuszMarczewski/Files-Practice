package pl.sda.Files.Simple.csvPractice;



import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class CSVReader {

    List<Movie> read(String filePath) {
        List<Movie> result = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String headerRow = bufferedReader.readLine();
            String[] headers = headerRow.split(";");

            String record;
            while ((record = bufferedReader.readLine()) != null) {
                String[] tokens = record.split(";");
                Movie movie = createMovie(headers, tokens);
                result.add(movie);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    private Movie createMovie(String[] headers, String[] tokens) {
        Movie movie = new Movie();
        for (int i = 0; i < headers.length; i++) {
            if ("name".equals(headers[i])) {
                movie.setName(tokens[i]);
            }
            if ("year".equals(headers[i])) {
                movie.setYear(Integer.parseInt(tokens[i]));
            }
            if ("star".equals(headers[i])) {
                movie.setStar(tokens[i]);
            }
            if ("sex".equals(headers[i])) {
                movie.setRating(Integer.parseInt(tokens[i]));

            }

        }
        return movie;
    }
}