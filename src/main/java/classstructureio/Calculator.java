package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number:");
        int firstNumber = sc.nextInt();
        System.out.print("Enter the second number:");
        int secondNumber = sc.nextInt();

        System.out.println(firstNumber + " + " + secondNumber + "!");

        int answer = firstNumber + secondNumber;
        System.out.println("(" + answer + ")!");
    }
}
