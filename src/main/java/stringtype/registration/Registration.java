package stringtype.registration;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        UserValidator userValidator = new UserValidator();
        boolean userNameIsValid = userValidator.isValidUserName(name);
        System.out.println(userNameIsValid);

        System.out.println("Enter your email: ");
        String email = sc.nextLine();
        boolean emailIsValid = userValidator.isValidEmail(email);
        System.out.println(emailIsValid);

        System.out.println("Enter your password(min 8 chars): ");
        String password = sc.nextLine();
        System.out.println("Enter your password again: ");
        String passwordAgain = sc.nextLine();

        boolean passwordIsValid = userValidator.isValidPassword(password, passwordAgain);
        System.out.println(passwordIsValid);

        String valid = userNameIsValid && emailIsValid && passwordIsValid ? "True" : "False";
        System.out.println("Registration successful:" + valid);

    }
}
