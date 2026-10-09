package introconstructors;

import java.time.LocalDateTime;

public class Task {
    private String title;
    private String description;
    private LocalDateTime startDate;
    private int durationInMin;

    public Task(String description, String title) {
        this.description = description;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public int getDurationInMin() {
        return durationInMin;
    }

    public void setDurationInMin(int durationInMin) {
        this.durationInMin = durationInMin;
    }

    public void start() {
        startDate = LocalDateTime.now();
    }

    public static void main(String[] args) {
        Task task = new Task("Todo desc", "todo title");
        task.start();

        System.out.println(task.getStartDate());
    }
}
