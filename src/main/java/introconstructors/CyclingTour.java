package introconstructors;

import java.time.LocalDate;

public class CyclingTour {
    private String description;// : a túra leírása.
    private LocalDate startTime;// : a túra kezdő dátuma.
    private int numberOfPeople;// : a túrázó csapat létszáma.
    private double kms;// : a túrán megtett kilométere

    public CyclingTour(String description, LocalDate startTime) {
        this.description = description;
        this.startTime = startTime;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public double getKms() {
        return kms;
    }

    public void registerPerson(int person) {
        numberOfPeople += person;
    }

    public void ride(double km) {
        kms += km;
    }

    public static void main(String[] args) {
        CyclingTour cyclingTour = new CyclingTour("cycle description", LocalDate.now());
        System.out.println(cyclingTour.getDescription());
        System.out.println(cyclingTour.getStartTime());
        System.out.println(cyclingTour.getKms());
        System.out.println(cyclingTour.getNumberOfPeople());

        cyclingTour.registerPerson(5);
        cyclingTour.ride(10);
        System.out.println(cyclingTour.getDescription());
        System.out.println(cyclingTour.getStartTime());
        System.out.println(cyclingTour.getKms());
        System.out.println(cyclingTour.getNumberOfPeople());
    }
}
