package POO;

import POO.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class ExecProduct {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data:");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();
        Product product = new Product(name, price, quantity);

        System.out.println();

        System.out.println("Product data: " + product);

        System.out.print("Enter the number of products to be added in stock: ");
        product.AddProducts(sc.nextInt());

        System.out.println("Update data: " + product);

        System.out.print("Enter the number of products to be removed from stock: ");
        product.RemoveProducts(sc.nextInt());

        System.out.println("Update data: " + product);
    }
}
