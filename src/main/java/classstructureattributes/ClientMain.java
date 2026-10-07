package classstructureattributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        client.name = sc.nextLine();

        System.out.print("Please enter your age: ");
        client.age = sc.nextInt();
        sc.nextLine();

        System.out.print("Please enter your address: ");
        client.address = sc.nextLine();

        System.out.println("Your data:");
        System.out.print("Name: " + client.name + "\n" + "Age: " + client.age + "\n" + "Address: " + client.address);
    }
}
