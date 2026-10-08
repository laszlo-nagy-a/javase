package statements;

import java.util.Scanner;

public class InvestmentMain {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Fund amount: ");
        int fundAmount = sc.nextInt();
        System.out.println("Interest rate: ");
        int interestRate = sc.nextInt();

        Investment investment = new Investment(fundAmount, interestRate);
        System.out.println("Capital: " +  investment.getFund());
        System.out.println("Yield for 50 days: " + investment.getYield(50));
        System.out.println("Withdraw amount after 80 days: " + investment.close(80));
        System.out.println("Withdraw amount after 90 days: " + investment.close(50));
    }
}
