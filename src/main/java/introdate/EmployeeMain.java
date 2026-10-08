package introdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        System.out.println("Employee registration");
        System.out.print("Please enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.print("Please enter your year of birth: ");
        int yearOfBirth = sc.nextInt();
        System.out.print("Please enter your month of birth (number): ");
        int monthOfBirth = sc.nextInt();
        System.out.print("Please enter your day of birth (number): ");
        int dayOfBirth = sc.nextInt();

        Employee employee = new Employee(name, LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth), LocalDateTime.now());

        System.out.println("Employee details");
        System.out.println(
                "Name: " + employee.getName() + "\r\n" +
                "Date of birth: " + employee.getDateOfBirth() + "\r\n" +
                "Registration date-time: " + employee.getBeginEmployment()
        );
    }
}
