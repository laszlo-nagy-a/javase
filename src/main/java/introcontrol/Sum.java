package introcontrol;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;

        for(int i = 1; i <= 5; i++) {
            System.out.println("Please enther the " + i + "th number:");
            number += sc.nextInt();
        }

        System.out.println("Sum: " + number);
    }
}
