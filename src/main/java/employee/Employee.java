package employee;

public class Employee {

    private String name;

    private String profession;

    private long firstHalfSalary;

    private long secondHalfSalary;

    public Employee(String name, String profession, long firstHalfSalary, long secondHalfSalary) {
        this.name = name;
        this.profession = profession;
        this.firstHalfSalary = firstHalfSalary;
        this.secondHalfSalary = secondHalfSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public long getFirstHalfSalary() {
        return firstHalfSalary;
    }

    public void setFirstHalfSalary(long firstHalfSalary) {
        this.firstHalfSalary = firstHalfSalary;
    }

    public long getSecondHalfSalary() {
        return secondHalfSalary;
    }

    public void setSecondHalfSalary(long secondHalfSalary) {
        this.secondHalfSalary = secondHalfSalary;
    }

    @Override
    public String toString() {
        return name.concat(" - ") + profession + " - " + (firstHalfSalary + secondHalfSalary);
    }
}
