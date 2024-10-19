package Array.Execs;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar? ");
        int n = sc.nextInt();
        double[] num = new double[n];

        for (int i = 0; i < num.length; i++) {
            System.out.print("Digite um numero: ");
            num[i] = sc.nextDouble();
        }

        double maior = 0;
        int posicaoMaior = 0;
        for (int i = 0; i < num.length; i++) {
            if(num[i] > maior){
                maior = num[i];
                posicaoMaior = i;
            }
        }
        System.out.println(" ");
        System.out.println("MAIOR VALOR = " + maior);
        System.out.println("POSIÇÃO DO MAIOR VALOR = " + posicaoMaior);
    }
}
