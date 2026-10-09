package intromethods.registration;

import java.time.LocalDate;
import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your firstname: ");
        String firstName = sc.nextLine();
        System.out.println("Enter your lastname: ");
        String lastName = sc.nextLine();
        System.out.println("Enter your birth year: ");
        int birthOfYear = sc.nextInt();
        System.out.println("Enter your birth month (in number format): ");
        int birtOfMonth = sc.nextInt();
        System.out.println("Enter your birth day: ");
        int birthOfDay = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your email: ");
        String email = sc.nextLine();

        Person person = new Person(concatName(firstName, lastName), createDateOfBirth(birthOfYear, birtOfMonth, birthOfDay), email);
        System.out.println(person);
    }

    public static String concatName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public static LocalDate createDateOfBirth(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }
}
