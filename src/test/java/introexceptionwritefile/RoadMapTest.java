package introexceptionwritefile;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

class RoadMapTest {

    @Rule
    TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Test
    void testWriteFile() throws IOException {
        Path path = temporaryFolder.newFile("settlement.txt").toPath();

        List<String> settlementNames = new ArrayList<>();
        settlementNames.add("Budapest");
        settlementNames.add("Szeged");

        new RoadMap().writeFile(path, settlementNames);

        List<String> linesRead = Files.readAllLines(path);
        org.junit.Assert.assertEquals(List.of("Budapest", "Szeged"), linesRead);
    }
}