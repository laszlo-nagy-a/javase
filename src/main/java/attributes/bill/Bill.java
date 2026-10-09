package attributes.bill;

public class Bill {
    public static void main(String[] args) {
        BillItem billItem = new BillItem("Razer Mouse", 100, 2, 27);
        System.out.println(billItem.calculateTotalPrice());
    }
}
