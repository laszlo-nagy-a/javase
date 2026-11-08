package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class RoadMapFinally {
    public static void main(String[] args) {
        final RoadMapFinally roadMap = new RoadMapFinally();
        final List<String> settlements = roadMap.getSettlementsFromSzegedToBekescsaba();

        final Path path = Paths.get("src/main/java/introexceptionwritefile/settlements.txt");
        roadMap.writeFile(path, settlements);

        System.out.println(roadMap.readFile(path));
        System.out.println(roadMap.readFile(path.resolve("kakao")));
    }

    private List<String> getSettlementsFromSzegedToBekescsaba() {
        List<String> settlementList = new ArrayList<>();
        settlementList.add("Algyő");
        settlementList.add("Hódmezővásárhely");
        settlementList.add("Székkutas");
        settlementList.add("Orosháza");
        settlementList.add("Csorvás");
        settlementList.add("Telekgerendás");
        settlementList.add("Békéscsaba");

        return settlementList;
    }

    public void writeFile(Path path, List<String> content) {
        try {
            Files.write(path, content);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public List<String> readFile(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException e) {
            throw new IllegalStateException("File filed to read.", e);
        } finally {
            System.out.println("It runs even if exception arise or return");
        }
    }
}
