package Array.Execs;


//Quantos numeros
//voce vai
//digitar?6D
//igite um
//numero:8D
//igite um
//numero:2D
//igite um
//numero:11D
//igite um
//numero:14D
//igite um
//numero:13D
//igite um
//numero:20
//NUMEROS PARES: 8 2 14 20
//QUANTIDADE DE PARES =4

import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        int[] numeros = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }
        int pares = 0;
        System.out.println("NUMEROS PARES: ");
        for (int i=0;i<n;i++){
            if ((numeros[i] % 2) == 0){
                System.out.print(numeros[i] + "  ");
                pares++;
            }
        }
        System.out.println("\nQUANTIDADE DE PARES: " + pares);






    }
}
