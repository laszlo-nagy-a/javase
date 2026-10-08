package finalmodifier;

public class TaxCalculator {
    public static final int TAX = 27;

    double tax(double price) {
        return (price / 100) * TAX;
    }

    double priceWithTax(double price) {
        return price + tax(price);
    }

    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();
        System.out.println(taxCalculator.tax(100));
        System.out.println(taxCalculator.priceWithTax(100));
    }
}
