package Array.Execs;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        int[] vetA = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vetA[i] = sc.nextInt();
        }
        double media = 0;
        int numPares = 0;
        for (int i = 0; i < n; i++){
            if(vetA[i] % 2 == 0){
                media = media + vetA[i];
                numPares++;
            }
        }
        if(media != 0){
            media = media / numPares;
            System.out.println("MEDIA DOS PARES = " + media);
        }else {
            System.out.println("NENHUM NUMERO PAR");
        }

    }
}
