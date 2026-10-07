package statements;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first time's hour: ");
        int firstTimeHour = sc.nextInt();

        System.out.println("Please enter the first time's minute: ");
        int firstTimeMinute = sc.nextInt();

        System.out.println("Please enter the first time's second: ");
        int firstTimeSecond = sc.nextInt();

        Time firstTime = new Time(firstTimeHour, firstTimeMinute, firstTimeSecond);

        System.out.println("Please enter the second time's hour: ");
        int secondTimeHour = sc.nextInt();

        System.out.println("Please enter the second time's minute: ");
        int secondTimeMinute = sc.nextInt();

        System.out.println("Please enter the second time's second: ");
        int secondTimeSecond = sc.nextInt();

        Time secondTime = new Time(secondTimeHour, secondTimeMinute, secondTimeSecond);

        System.out.println("The first time is " + firstTime.toString() + " = " + firstTime.getInMinutes() + " minutes");
        System.out.println("The second time is " + secondTime.toString() + " = " + secondTime.getInSeconds() + " seconds");
        System.out.println("The first earlier then the second: " + firstTime.earlierThan(secondTime));
    }
}
