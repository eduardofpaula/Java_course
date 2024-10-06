package Array.Execs;

import java.util.Locale;
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar? ");
        int a = sc.nextInt();
        double[] vect = new double[a];
        for (int i = 0;i < a;i++){

            System.out.print("Digite um numero:");
            double x = sc.nextDouble();
            vect[i] += x;

        }
        double soma = 0;
        System.out.print("VALORES = ");
        for (double v : vect) {
            System.out.printf(String.valueOf(v) + " ");
            soma += v;
        }
        double media = soma / a;
        System.out.println("\n SOMA = " + soma + "\n" + "MEDIA = " + media);
    }
}
