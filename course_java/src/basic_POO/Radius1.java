package basic_POO;

import java.util.Locale;
import java.util.Scanner;

public class Radius1 {

    // final = valor não é alterado
    public static final double PI = 3.14159;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = circumference(radius);

        double v = volume(radius);

        System.out.println("Circumference: %.2f%n" + c);
        System.out.println("Volume: %.2f%n" + v);
        System.out.println("PI Value: %.2f%n" + PI);
    }

    public static double circumference(double radius){
        return 2.0 * PI * radius;
    }

    public static double volume(double radius){
        return 4.0 * PI * radius * radius * radius / 3.0;
    }


}
