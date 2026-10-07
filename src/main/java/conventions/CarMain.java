package conventions;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car("Fiat", "Diesel", 5, 5);
        car.setCarType("Seat");
        car.setEngineType("Gasoline");
        car.setDoors(3);
        car.setPerson(2);
        car.addModelName("Ibiza");

        System.out.println("Car status");
        System.out.println(
                "Car type:" + car.getCarType() + "\n" +
                "Engine type:" + car.getEngineType() + "\n" +
                "Door number:" + car.getDoors() + "\n" +
                "Person number:" + car.getPerson()
        );
    }
}
