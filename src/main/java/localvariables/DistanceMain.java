package localvariables;

public class DistanceMain {
    public static void main(String[] args) {
        Distance distance = new Distance(1.3, true);

        System.out.println("distance:" + distance.getDistanceInKm() + " exact:" + distance.isExact());

        int distanceInInt = (int) distance.getDistanceInKm();
        System.out.println("distance in int:" + distanceInInt);
    }
}
