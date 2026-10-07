package conventions;

public class Car {

    private String carType;
    private String engineType;
    private int doors;
    private int person;

    public Car(String carType, String engineType, int doors, int person) {
        this.carType = carType;
        this.engineType = engineType;
        this.doors = doors;
        this.person = person;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public int getPerson() {
        return person;
    }

    public void setPerson(int person) {
        this.person = person;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void addModelName(String modelName) {
        this.carType = carType + " " + modelName;
    }
}