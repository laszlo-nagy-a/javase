package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class RoadMapForJunitFive {
    public static void main(String[] args) {
        final RoadMapForJunitFive roadMap = new RoadMapForJunitFive();
        final List<String> settlements = roadMap.getSettlementsFromSzegedToBekescsaba();

        final Path path = Paths.get("src/main/java/introexceptionwritefile/settlements.txt");
        roadMap.writeFile(path, settlements);
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
}
