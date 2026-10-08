package statements;

public class Investment {
    private double cost = 0.3;
    private int fund;
    private int interestRate;
    private boolean active = true;

    public Investment(int fund, int interestRate) {
        this.fund = fund;
        this.interestRate = interestRate;
    }

    public int getFund() {
        return fund;
    }

    public double getYield(int days) {
        double fundOnePercent = getFund() / 100;
        double yieldForOneYear = fundOnePercent * interestRate;
        double yieldForOneDay = yieldForOneYear / 365;
        return yieldForOneDay * days;
    }

    public double close(int days) {
        double interest = getYield(days);
        double fundWithInterest = getFund() + interest;
        double costPaymentAmount = (fundWithInterest/100) * cost;
        double withdraw = fundWithInterest - costPaymentAmount;
        double payoutAmount = active ? withdraw : 0.0;
        active = false;

        return payoutAmount;
    }
}
