package classstructureio;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        System.out.println("Registration");

        System.out.print("Please enter your username:");
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        System.out.print("Please enter your email address:");
        String email = sc.nextLine();

        System.out.println("Registration successful with '" + username + "' username and '" + email + "' email!");
    }
}
