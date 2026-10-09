package enumtype.position;

public enum Position {
    ADMINISTRATOR(1, "benefit1"),
    PO(2, "benefit2"),
    DEVELOPER(3, "benefit3"),
    MANAGER(4, "benefit4");

    private int salary;
    private String benefit;

    Position(int salary, String benefit) {
        this.salary = salary;
        this.benefit = benefit;
    }

    public int getSalary() {
        return salary;
    }

    public String getBenefit() {
        return benefit;
    }
}
