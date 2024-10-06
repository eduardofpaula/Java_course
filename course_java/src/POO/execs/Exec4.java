package POO.execs;

import POO.entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Exec4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        CurrencyConverter conversor = new CurrencyConverter();

        System.out.print("What is the dollar price? ");
        conversor.setPrice(sc.nextDouble());
        System.out.print("How many dollars will be bought? ");
        conversor.setDollar(sc.nextDouble());

        conversor.mult(conversor.getPrice(), conversor.getDollar());
        double reaisPago = conversor.converter();

        System.out.println("Amount to be paid in reais: " + reaisPago);
    }
}
