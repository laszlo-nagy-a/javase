package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Neptun {

    public static void main(String[] args) {
        try {
            List<String> neptunRows = new Neptun().readNeptunCsvRows();
            System.out.println(neptunRows);
        } catch (IOException exception) {
            System.out.println("Something went wrong, check stack trace for details. Error message: " + exception.getMessage());
            exception.printStackTrace();
        }
    }

    List<String> readNeptunCsvRows() throws IOException {
        return Files.readAllLines(Paths.get("src/main/java/introexceptioncheckedtrace/neptun.csv"));
    }
}
