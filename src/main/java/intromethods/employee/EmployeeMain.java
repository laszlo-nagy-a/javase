package intromethods.employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("Aladar", 2010, 999999);
        employee.raiseSalary(1);
        System.out.println(employee);
    }
}
