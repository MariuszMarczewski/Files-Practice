package pl.sda.Files.Simple;

class App {

    public static void main(String args[]){
        SimpleFileReader reader = new SimpleFileReader();
        reader.readFile("C:\\Users\\lenovo\\IdeaProjects\\SDA_J19_Files\\src\\main\\resources\\simple.txt");

        SimpleFileWriter writer = new SimpleFileWriter();
        writer.write("Moja zawartość", "C:\\Users\\lenovo\\IdeaProjects\\SDA_J19_Files\\src\\main\\resources\\test.txt");
    }
}
