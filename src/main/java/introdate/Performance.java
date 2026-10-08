package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class Performance {
    private String artist;
    private LocalDate performanceDate;
    private LocalTime startTime;
    private LocalTime endTime;

    public Performance(String artist, LocalDate performanceDate, LocalTime startTime, LocalTime endTime) {
        this.artist = artist;
        this.performanceDate = performanceDate;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getArtist() {
        return artist;
    }

    public LocalDate getPerformanceDate() {
        return performanceDate;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public String getInfo() {
        return artist + ": " + performanceDate + " " + startTime + " - " + endTime;
    }
}
