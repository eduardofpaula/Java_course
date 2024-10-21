package Array.Execs;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoMedia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        double[] vetA = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vetA[i] = sc.nextDouble();
        }
        double media = 0;
        for (int i = 0; i < n; i++) {
            media += vetA[i];
        }
        media = media / n;
        System.out.println(" ");
        System.out.println("MEDIA DO VETOR = " + media);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for (int i = 0; i < n; i++){
            double[] vetB = new double[n];
            if(vetA[i] < media){
                vetB[i] = vetA[i];
                System.out.println(vetB[i]);
            }
        }
    }
}
