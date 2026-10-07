package classstructureintegrate;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter owner name:");
        String owner = sc.nextLine();
        System.out.println("Enter account number:");
        String account = sc.nextLine();
        System.out.println("Enter balance:");
        int balance = sc.nextInt();

        BankAccount bankAccount = new BankAccount(account, owner, balance);
        System.out.println("Bank account info");
        System.out.println(bankAccount.getInfo());

        System.out.println("Deposit to balance:");
        bankAccount.deposit(sc.nextInt());

        System.out.println(bankAccount.getInfo());
        System.out.println("Withdraw from balance:");
        bankAccount.withdraw(sc.nextInt());
        System.out.println(bankAccount.getInfo());


    }
}
