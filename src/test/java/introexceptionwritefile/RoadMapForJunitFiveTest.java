package introexceptionwritefile;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

class RoadMapForJunitFiveTest {

    @TempDir
    File temporaryFolder;

    @Test
    void test() throws IOException {
        Path path = temporaryFolder.toPath();
        System.out.println(path);
        Path pathWithFile = path.resolve("test.txt");
        System.out.println(pathWithFile);

        List<String> names = List.of("a", "b", "c");

        new RoadMap().writeFile(pathWithFile, names);

        Assertions.assertEquals(List.of("a", "b", "c"), Files.readAllLines(pathWithFile));

    }
}