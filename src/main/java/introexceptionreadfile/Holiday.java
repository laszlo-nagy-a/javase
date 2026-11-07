package introexceptionreadfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Holiday {

    public static void main(String[] args) {
        try {
            List<String> fileLines = Files.readAllLines(Paths.get("holiday.txt"));
            System.out.println(fileLines);
        } catch (IOException e) {
            System.out.println("Nem létezik ez a fájl");
        }

    }

}
