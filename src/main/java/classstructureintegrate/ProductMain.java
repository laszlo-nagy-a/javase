package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product name:");
        String productName = sc.nextLine();

        System.out.println("Enter price:");
        int price = sc.nextInt();

        Product product = new Product(productName, price);
        product.increasePrice(10);

        System.out.println("Product information after increasing price");
        System.out.println("Product name:" + product.getName() + " price:" + product.getPrice());
    }
}
