package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TrackPoints {
    public static void main(String[] args) {
        try {
            List<Integer> heightValues = new TrackPoints().getAllHeightValues();

            for(int i = 0; i < heightValues.size(); i++) {
                if(i+1 != heightValues.size()) {
                    System.out.println(heightValues.get(i+1) - heightValues.get(i));
                }
            }
        } catch (IllegalStateException e) {
            System.out.println("Wrapped (cause) exception message:");
            System.out.println(e.getCause().getMessage());
            System.out.println("Exception message:");
            System.out.println(e.getMessage());
        }

    }

    List<String> readTrackingLines() throws IOException {
        return Files.readAllLines(Paths.get("src/main/java/introexceptioncause/tracking.txt"));
    }

    List<Integer> getAllHeightValues() {
        try {
            List<String> trackingLines = readTrackingLines();

            List<Integer> heightValues = new ArrayList<>();
            for (String trackingLine : trackingLines) {
                String[] values = trackingLine.split(";");
                heightValues.add(Integer.parseInt(values[2]));
            }

            return  heightValues;
        } catch (IOException ex) {
            throw new IllegalStateException("Fájl nem olvasható", ex);
        }
    }
}
