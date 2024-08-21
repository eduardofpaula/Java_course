package POO;

import java.util.Locale;
import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        POO.entities.Calculator1 calc = new POO.entities.Calculator1();

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = calc.circumference(radius);

        double v = calc.volume(radius);

        System.out.println("Circumference: %.2f%n" + c);
        System.out.println("Volume: %.2f%n" + v);
        System.out.println("PI Value: %.2f%n" + calc.PI);
    }
}
