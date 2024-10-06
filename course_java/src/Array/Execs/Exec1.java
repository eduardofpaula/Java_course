package Array.Execs;

import Array.Entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Exec1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for (int i=0; i< vect.length; i++){
            // quebra de linha
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name,price);
        }
        double soma = 0;
        for(int i=0;i<vect.length;i++){
            soma += vect[i].getPrice();
        }

        double avg = soma / vect.length;

        System.out.println("AVERAGE PRICE = " + avg);

        sc.close();
    }
}
